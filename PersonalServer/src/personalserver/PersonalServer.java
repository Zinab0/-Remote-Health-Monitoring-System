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
package personalserver;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class PersonalServer {

    public static void main(String[] args) throws IOException{
        /* This server (Personal Server) has two sides:
            1. Client-side: Sends the appropriate msg to the Medical Server. It acts like a client for the Medical Server.
            2. Server-side: Recieves the data -heart rate, oxygen and temp- from the Sensor. It acts as a server for the Sensor.
        */

        
        // Create GUI objects 
        GUI_P gui_tempV = new GUI_P();
        GUI_P gui_tempD = new GUI_P();
        GUI_P gui_tempT = new GUI_P();
        GUI_P gui_tempS = new GUI_P();
        
        GUI_P gui_heartV = new GUI_P();
        GUI_P gui_heartD = new GUI_P();
        GUI_P gui_heartT = new GUI_P();
        GUI_P gui_heartS = new GUI_P();
        
        GUI_P gui_oxyV = new GUI_P();
        GUI_P gui_oxyD = new GUI_P();
        GUI_P gui_oxyT = new GUI_P();
        GUI_P gui_oxyS = new GUI_P();
        
        GUI_P gui_action = new GUI_P();
        
        
        
        // Create some variables needed for the GUI (will be sent to GUI_P)
        String tempS = "";
        String heartS = "";
        String oxyS = "";
        String action = "";
        
        
        

        /* 1. Server-Side:*/
        
        //create a server socket for the server-side of the Personal server to recieve data from the sensor, 
        // use the same port number of the sensor (8000)
        ServerSocket serverSocket = new ServerSocket(8000);
        






        /* ------------------------------------------------------------------------------------- */
        /* 2. Client-Side:*/
        String host = "localhost";
//        // Addresses
//        InetAddress addresses=InetAddress.getByName( "192.168.3.49");
//        // HostName
//        String host = addresses.getHostName();
        // Create a client socket for the client-side for the Personal server to send data to the Medical server
        Socket clientSocket = new Socket(host, 9800);



        // Create a data stream to convert data into stream, so it can be sent to the client
        DataOutputStream AlertToMedical = new DataOutputStream(clientSocket.getOutputStream());

        //create a socket object to accept and listen for the connection of the client
        Socket socket = serverSocket.accept();
        //create a data stream to convert stream into data, so it can be read by the server
        DataInputStream fromSensor = new DataInputStream(socket.getInputStream());


        while (true) {


            // Server-Side: Receive data from the sensor
            double temperature = fromSensor.readDouble();
            String temp_date = fromSensor.readUTF();
            String temp_time = fromSensor.readUTF();
            
            

            double heartRate = fromSensor.readDouble();
            String heart_date = fromSensor.readUTF();
            String heart_time = fromSensor.readUTF();

            double oxygenSaturation = fromSensor.readDouble();
            String oxygen_date = fromSensor.readUTF();
            String oxygen_time = fromSensor.readUTF();


            // Process sensor's data
            /* show the caregiver's interface window*/
            /* Send msg to the caregiver's interface */
            if (temperature > 38) {
                System.out.print("At date: " + temp_date + ", time: " + temp_time + ", ");
                tempS = "Temperature is high ";
                System.out.print(tempS);
                System.out.print(temperature);
                action = " An alert message is sent to the Medical Server.";
                System.out.println(". " + action);
                
                
                gui_tempV.displayTempV(Double.toString(temperature));
                gui_tempD.displayTempDDD(temp_date);
                gui_tempT.displayTempT(temp_time);
                gui_tempS.displayTempS(tempS);
                gui_action.displayAction(action);
                
                gui_action.setVisible(true);

            } else {
                System.out.print("At date: " + temp_date + ", time: " + temp_time + ", ");
                tempS = "Temperature is normal ";
                System.out.print(tempS);
                System.out.println(temperature);
                
                gui_tempV.displayTempV(Double.toString(temperature));
                gui_tempD.displayTempDDD(temp_date);
                gui_tempT.displayTempT(temp_time);
                gui_tempS.displayTempS(tempS);
                gui_action.displayAction(action);
                
                gui_action.setVisible(true);
            }
            
            
            
            if (heartRate > 100) {
                System.out.print("At date: " + heart_date + ", time: " + heart_time + ", ");
                heartS = "Heart rate is above normal ";
                System.out.print(heartS);
                System.out.print( heartRate);
                action = " An alert message is sent to the Medical Server.";
                System.out.println(". " + action);
                
                
                gui_heartV.displayHeartV(Double.toString(heartRate));
                gui_heartD.displayHeartD(heart_date);
                gui_heartT.displayHeartT(heart_time);
                gui_heartS.displayHeartS(heartS);
                gui_action.displayAction(action);
                
                gui_action.setVisible(true);
                
            
            }else if(heartRate < 60) {
                System.out.print("At date: " + heart_date + ", time: " + heart_time + ", ");
                heartS = "Heart rate is below normal ";
                System.out.print(heartS);
                System.out.print( heartRate);
                action = " An alert message is sent to the Medical Server.";
                System.out.println(". " + action);
                
                
                gui_heartV.displayHeartV(Double.toString(heartRate));
                gui_heartD.displayHeartD(heart_date);
                gui_heartT.displayHeartT(heart_time);
                gui_heartS.displayHeartS(heartS);
                gui_action.displayAction(action);
                
                gui_action.setVisible(true);
            
            } else {
                System.out.print("At date: " + heart_date + ", time: " + heart_time + ", ");
                heartS = "Heart rate is normal ";
                System.out.print(heartS);
                System.out.println( heartRate);
                
                gui_heartV.displayHeartV(Double.toString(heartRate));
                gui_heartD.displayHeartD(heart_date);
                gui_heartT.displayHeartT(heart_time);
                gui_heartS.displayHeartS(heartS);
                gui_action.displayAction(action);
                
                gui_action.setVisible(true);
                
            
            }
          


            
            
            if (oxygenSaturation < 75) {
                
                System.out.print("At date: " + oxygen_date + ", time: " + oxygen_time + ", ");
                oxyS = "Oxygen Saturation is low ";
                System.out.print(oxyS);
                System.out.print(oxygenSaturation);
                action = (" An alert message is sent to the Medical Server.");
                System.out.println(". " + action);
                
                
                gui_oxyV.displayOxyV(Double.toString(oxygenSaturation));
                gui_oxyD.displayOxyD(oxygen_date);
                gui_oxyT.displayOxyT(oxygen_time);
                gui_oxyS.displayOxyS(oxyS);
                gui_action.displayAction(action);
                
                gui_action.setVisible(true);
                
                
                

            } else {
                System.out.print("At date: " + oxygen_date + ", time: " + oxygen_time + ", ");
                oxyS = "Oxygen Saturation is normal ";
                System.out.print(oxyS);
                System.out.print(oxygenSaturation);
                
                
                gui_oxyV.displayOxyV(Double.toString(oxygenSaturation));
                gui_oxyD.displayOxyD(oxygen_date);
                gui_oxyT.displayOxyT(oxygen_time);
                gui_oxyS.displayOxyS(oxyS);
                gui_action.displayAction(action);
                
                gui_action.setVisible(true);
            }
           


            
            
            
            
            // Client-side: Send data to the Medical Server

            AlertToMedical.writeDouble(temperature);
            AlertToMedical.writeUTF(temp_date);
            AlertToMedical.writeUTF(temp_time);

            AlertToMedical.writeDouble(heartRate);
            AlertToMedical.writeUTF(heart_date);
            AlertToMedical.writeUTF(heart_time);

            AlertToMedical.writeDouble(oxygenSaturation);
            AlertToMedical.writeUTF(oxygen_date);
            AlertToMedical.writeUTF(oxygen_time);

            System.out.println();

        }

    }
}
