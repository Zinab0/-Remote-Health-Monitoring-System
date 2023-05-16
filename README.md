# Simulating a Remote Health Monitoring System for elderly patients using client-server TCP Sockets


This repository contains an implementation of a Remote Health Monitoring System (RHMS) application using Java TCP Sockets and GUI elements. The RHMS application is designed for remote care of elderly patients suffering from chronic diseases.

The application uses a client-server architecture where the client, in this case, a sensor, sends data to the personal server. The personal server acts as both a client and a server, receiving data from the sensor and sending a notification to the medical server.
<img width="906" alt="image" src="https://github.com/Zinab0/Remote-Health-Monitoring-System/assets/77127247/5eb94877-35b4-434f-9355-0c238b1cf0a2">

The RHMS application also includes a GUI that uses Java Swing components to display patient data. The application is implemented using TCP sockets, and threads are used to update the values of temperature, oxygen saturation, and heart rate.

## Usage
To run the application, you will need to have Java installed on your computer. Clone the repository and run the RHMSApplication.java file. The application will open a GUI window that displays patient data.

## RHMS Application run snapshots
 one case when the temperature exceeds 39,  heart rate is above 100, and the oxygen is below 95:
<img width="663" alt="image" src="https://github.com/Zinab0/Remote-Health-Monitoring-System/assets/77127247/a1efb5d9-cb3a-4f0f-b267-05fc506c6d9f">

  The personal server determines whether the measurements are normal or abnormal.
<img width="734" alt="image" src="https://github.com/Zinab0/Remote-Health-Monitoring-System/assets/77127247/ab395315-6bd4-4a96-8a4a-ed1900699d51">

 The medical server will display “Send an ambulance to the patient!”
<img width="737" alt="image" src="https://github.com/Zinab0/Remote-Health-Monitoring-System/assets/77127247/38d8d46b-99c0-42fa-9de2-1ad72c682524">
