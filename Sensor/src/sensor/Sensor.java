/* Group No. 9:
    _______________________________
    CPCS-371
    Project: Simulating a RHMS for elderly patients using client-server TCP Sockets
    Date: 11 Feb, 2021
    Group members:
        1. Ghaida Alsharif
        2. Zainab Alsaggaf 
        3. Reem Alsubaie 
        4. Raghad Alzahrani 
        5. Dhay Alharbi
        6. Mona Alharbi   
*/
package sensor;
import java.io.*;
import java.net.InetAddress;
import java.time.*;
import java.util.*;
import java.net.Socket;
public class Sensor {

        public static void main(String[] args) throws IOException, InterruptedException {
            /* 
            Sensor: Collects the data (heart rate, oxygen and temp) and sends them to the server-side of Personal Server. 
                    It acts like a client for the Personal Server.
            */

            
            
        // Create a scanner object
        Scanner userInput = new Scanner(System.in);
        
        
        // create jFrame objects (to send data to the JFrame and display them there)
        GUI_S jf_tempV = new GUI_S();
        GUI_S jf_rateV = new GUI_S();
        GUI_S jf_oxyV = new GUI_S();
        
        GUI_S jf_tempD = new GUI_S();
        GUI_S jf_rateD = new GUI_S();
        GUI_S jf_oxyD = new GUI_S();
        
        GUI_S jf_tempT = new GUI_S();
        GUI_S jf_rateT = new GUI_S();
        GUI_S jf_oxyT = new GUI_S();


        int port = 8000;
        String host="localhost";
        // TWO PCs CODE
//        // Addresses
//        InetAddress addresses=InetAddress.getByName( "192.168.3.49");
//        // HostName
//        String host = addresses.getHostName();

        // Create a client socket
        Socket socket = new Socket(host, port);
        try {
            Random random = new Random();
            // Minimum  and Maximum values of range on Temperature, Heart, and Oxygen
            int Min_Temperature = 36, Max_Temperature = 41;
            int Min_Heart = 50, Max_Heart = 120;
            int Min_Oxygen = 60, Max_Oxygen = 100;

            // Create a data stream
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // The wanted period of time the sensor will run
            System.out.print("Enter the wanted period of time ( more than or equal 60 sec ): ");
            long runTime = userInput.nextInt();

            // persistent TCP connection
            long startTime = System.currentTimeMillis();

            while (System.currentTimeMillis() - startTime < runTime * 1000) { // The minimum time of execution is 60 seconds


                // Evaluate random numbers
                double Temperature = random.nextInt(Max_Temperature - Min_Temperature + 1) + Min_Temperature;
                double Heart = random.nextInt(Max_Heart - Min_Heart + 1) + Min_Heart;
                double Oxygen = random.nextInt(Max_Oxygen - Min_Oxygen + 1) + Min_Oxygen;




                
                
                // Sensor data sent to personal server
                dataOutputStream.writeDouble(Temperature);
                String dateT=LocalDate.now().toString();
                String timeT=LocalTime.now().toString();
                dataOutputStream.writeUTF(dateT);
                dataOutputStream.writeUTF(timeT);
                System.out.println("At date: " +dateT + ", time: " + timeT + ", sensed temperature is " + Temperature );

                
                jf_tempV.displayTemp(Double.toString(Temperature)); /* Send temperature to GUI*/
                jf_tempD.displayTempD(dateT);
                jf_tempT.displayTempT(timeT);

                /* ... */
                dataOutputStream.writeDouble(Heart);
                String dateH=LocalDate.now().toString();
                String timeH=LocalTime.now().toString();
                dataOutputStream.writeUTF(dateH);
                dataOutputStream.writeUTF(timeH);
                System.out.println("At date: " + dateH+ ", time: " + timeH + ", sensed heart rate is " + Heart );

                
                jf_rateV.displayHeart(Double.toString(Heart)); /* Send temperature to GUI*/
                jf_rateD.displayHeartD(dateH);
                jf_rateT.displayHeartT(timeH);
                

                /* ... */
                dataOutputStream.writeDouble(Oxygen);
                String dateO=LocalDate.now().toString();
                String timeO=LocalTime.now().toString();
                dataOutputStream.writeUTF(dateO);
                dataOutputStream.writeUTF(timeO);
                System.out.println("At date: " + dateO+ ", time: " + timeO + ", sensed oxygen saturation is " + Oxygen );


                /* ... */
                jf_oxyV.displayOxy(Double.toString(Oxygen)); /* Send oxygen simulation to JFrame*/
                jf_oxyD.displayOxyD(dateO);
                jf_oxyT.displayOxyT(timeO);
                
                
                // Opens the GUI interface and display the patient data
                jf_oxyT.setVisible(true);
                System.out.println();
                
                Thread.sleep(5000);// Delay for 5 seconds
            }
            
            

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is end of program to check sensor");
    }

    
}
