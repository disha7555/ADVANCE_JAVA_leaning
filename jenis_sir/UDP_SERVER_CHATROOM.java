/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenis_sir;
import java.net.*;
import java.util.*;
public class UDP_SERVER_CHATROOM {
    public static void main(String[] args) throws Exception {
        int receivePort = 2000; // Use to receive Data from Other end
        int sendPort = 3333; // Use to send data to other end 
        String sendString = ""; // use to send data 
        String receiveString = ""; // use to receive data 
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket(receivePort);
        byte[] receiveData = new byte[1024];
        InetAddress ia = InetAddress.getLocalHost();
        while(true)
        {
            
            // Code to recieve Data from Other End
            
           
            DatagramPacket dp1 = new DatagramPacket(receiveData, receiveData.length);
            ds.receive(dp1);
            receiveString = new String(dp1.getData());
           // receiveString = new String(dp1.getData(), 0, dp1.getLength());
            System.out.println("Received Message is : "+receiveString);
            
            
            if(receiveString.equals("stop"))
            {
                System.out.println("You have received Stop");
                ds.close();
                break;
                
            }
            receiveData = new byte[1024];
            // Take data from user & send to the other end
            System.out.println("Enter Your Message: ");
            sendString = sc.nextLine();
            byte [] sendData = sendString.getBytes();
            DatagramPacket dp2 = new DatagramPacket(sendData, sendData.length, ia, sendPort);
            ds.send(dp2);
            
        }
       
    }
 
}
