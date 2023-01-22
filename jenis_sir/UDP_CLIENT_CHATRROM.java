
package jenis_sir;
import java.net.*;
import java.util.*;
public class UDP_CLIENT_CHATRROM {
    public static void main(String[] args) throws Exception
    {
        int receivePort = 3333; // Use to receive Data from Other end
        int sendPort = 2000; // Use to send data to other end 
        String sendString = ""; // use to send data 
        String receiveString = ""; // use to receive data 
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket(receivePort);
        InetAddress ia = InetAddress.getLocalHost();
        byte[] receiveData = new byte[1024];
        while(true)
        {
            // Take data from user & send to the other end
            System.out.println("Enter Your Message: ");
            sendString = sc.nextLine();
            byte [] sendData = sendString.getBytes();
            DatagramPacket dp1 = new DatagramPacket(sendData, sendData.length, ia, sendPort);
            ds.send(dp1);
            
            // Code to recieve Data from Other End
            
          
            DatagramPacket dp2 = new DatagramPacket(receiveData, receiveData.length);
            ds.receive(dp2);
            receiveString = new String(dp2.getData());
            System.out.println("Received Message is : "+receiveString);
        
            if(sendString.equals("stop"))
            {
                System.out.println("You have received Stop");
                ds.close();
                break;
                
            }
            
           // receiveData = new byte[1024];
        
        }
       // ds.close();
        
    } 
}
