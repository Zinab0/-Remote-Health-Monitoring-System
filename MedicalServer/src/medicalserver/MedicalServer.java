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
package medicalserver;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class MedicalServer {
    public static void main(String[] args)  throws IOException {
        /* 
            Medical Server: Recieves msg about the patient status from the Personal server.
                            Displays the recieved msg to the caregiver.
        */
        
        
        // Create GUI objects 
        GUI_M gui_temp_value = new GUI_M();
        GUI_M gui_temp_date = new GUI_M();
        GUI_M gui_temp_time = new GUI_M();
        
        GUI_M gui_heart_value = new GUI_M();
        GUI_M gui_heart_date = new GUI_M();
        GUI_M gui_heart_time = new GUI_M();
        
        GUI_M gui_oxy_value = new GUI_M();
        GUI_M gui_oxy_date = new GUI_M();
        GUI_M gui_oxy_time = new GUI_M();
        
        GUI_M gui_action = new GUI_M();
        
        
        // Create some variables needed for the GUI (will be sent to GUI_M)
        String temp_status = "";
        String heart_status = "";
        String oxy_status = "";
        String action = "";
        
        
        // Create a server socket (As the Medical Server is only server-side) to recieve data from the Personal server on the same port --> 9800
        ServerSocket serverSocket = new ServerSocket(9800);

        // Create a socket to connect to a client
        Socket socket = serverSocket.accept();

        // Create DataInputStream stream input and the DataOutput stream output to read and write primitive data values
        DataInputStream input = new DataInputStream(socket.getInputStream());

        // infinite loop to accept connection requests from the Personal Server
        while (true) {

            // Receive measurements from the Personal server
            double temp_value = input.readDouble();
            String temp_date = input.readUTF();
            String temp_time = input.readUTF();

            double heart_value = input.readDouble();
            String heart_date = input.readUTF();
            String heart_time = input.readUTF();

            double oxygen_value = input.readDouble();
            String oxygen_date = input.readUTF();
            String oxygen_time = input.readUTF();

            //If the temperature exceeds 39 and heart rate is above 100 and oxygen is below 95
            if ((temp_value>39) && (heart_value > 100) && (oxygen_value<95)){
                
                // print temp & send to GUI
                System.out.print("At date: " + temp_date + ", time: " + temp_time + ", ");
                temp_status = "Temperature is high ";
                System.out.print(temp_status);
                System.out.println(temp_value);
                
                gui_temp_value.display_temp_value(temp_value + "");
                gui_temp_date.display_temp_date(temp_date);
                gui_temp_time.display_temp_time(temp_time);
                
                
                // print heart & send to GUI
                System.out.print("At date: " + heart_date + ", time: " + heart_time + ", ");
                heart_status = "Heart rate is above normal ";
                System.out.print(heart_status);
                System.out.println(heart_value);
                
                gui_heart_value.display_heart_value(""+heart_value);
                gui_heart_date.display_heart_date(heart_date);
                gui_heart_time.display_heart_time(heart_time);
                
                
                // print oxygen & send to GUI
                System.out.print("At date: " + oxygen_date + ", time: " + oxygen_time + ", ");
                oxy_status = "Oxygen saturation is low ";
                System.out.print(oxy_status);
                System.out.println(oxygen_value);
                
                gui_oxy_value.display_oxy_value(oxygen_value + "");
                gui_oxy_date.display_oxy_date(oxygen_date);
                gui_oxy_time.display_oxy_time(oxygen_time);
                           
                
                // print action & send to GUI
                action = "ACTION: Send an ambulance to the patient!\n";
                System.out.println(action);
                
                gui_action.display_action(action);
                gui_action.setVisible(true);

            }
            //If the temperature is between 38 and 38.9, and the heart rate is between 95 and 98, and oxygen is below 80
            else if ((temp_value >= 38 && temp_value<= 38.9) && (heart_value >= 95 && heart_value<= 98) && (oxygen_value< 80)){
                
                // print temp & send to GUI
                System.out.print("At date: " + temp_date + ", time: " + temp_time + ", ");
                temp_status = " Temperature:  ";
                System.out.print(temp_status);
                System.out.println(temp_value );
                
                gui_temp_value.display_temp_value(temp_value + "");
                gui_temp_date.display_temp_date(temp_date);
                gui_temp_time.display_temp_time(temp_time);
                
                
                // print heart & send to GUI
                System.out.print("At date: " + heart_date + ", time: " + heart_time + ", ");
                heart_status = " Heart rate: ";
                System.out.print(heart_status);
                System.out.println(heart_value );
                
                gui_heart_value.display_heart_value(""+heart_value);
                gui_heart_date.display_heart_date(heart_date);
                gui_heart_time.display_heart_time(heart_time);
                
                
                // print oxygen & send to GUI
                System.out.print("At date: " + oxygen_date + ", time: " + oxygen_time + ", "); 
                oxy_status = " Oxygen saturation: ";
                System.out.print(oxy_status);
                System.out.println(oxygen_value );
                
                gui_oxy_value.display_oxy_value(oxygen_value + "");
                gui_oxy_date.display_oxy_date(oxygen_date);
                gui_oxy_time.display_oxy_time(oxygen_time);
                
                
                // print action & send to GUI
                action = "ACTION: Call the patient's family!\n";
                System.out.println(action);
                
                gui_action.display_action(action);
                gui_action.setVisible(true);
            }
            else{
                
                // print temp & send to GUI
                System.out.print("At date: " + temp_date + ", time: " + temp_time + ", "); 
                temp_status = " Temperature:  ";
                System.out.print(temp_status);
                System.out.println(temp_value);
                
                gui_temp_value.display_temp_value(temp_value + "");
                gui_temp_date.display_temp_date(temp_date);
                gui_temp_time.display_temp_time(temp_time);
                
                
                
                
                // print heart & send to GUI
                System.out.print("At date: " + heart_date + ", time: " + heart_time + ", "); 
                heart_status = "Heart rate: ";
                System.out.print(heart_status);
                System.out.println(heart_value );
                
                gui_heart_value.display_heart_value( ""+heart_value);
                gui_heart_date.display_heart_date(heart_date);
                gui_heart_time.display_heart_time(heart_time);
                
                
                
                
                // print oxygen & send to GUI
                System.out.print("At date: " + oxygen_date + ", time: " + oxygen_time + ", "); 
                oxy_status = "Oxygen saturation: ";
                System.out.print(oxy_status);
                System.out.println(oxygen_value);
                
                gui_oxy_value.display_oxy_value(oxygen_value + "");
                gui_oxy_date.display_oxy_date(oxygen_date);
                gui_oxy_time.display_oxy_time(oxygen_time);
                
                
                
                // print action & send to GUI
                action = "ACTION: Warning, advise patient to make a checkup appointment!\n";
                System.out.println(action);
                
                gui_action.display_action(action);
                gui_action.setVisible(true);
            }

        }
    }
    
    
}
