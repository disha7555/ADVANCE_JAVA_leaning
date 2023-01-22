 
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenis_sir;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author Jenis Shah
 */
public class CLIENT_CHATROOM  {
     public static void main(String[] args) throws Exception{
        String serverIp ="127.0.0.1";
        int port = 2022;
        Socket s = new Socket(serverIp, port);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
       
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        Scanner sc = new Scanner(System.in);
        
        String msg="";
        while(!(msg.equals("stop"))){
        
            System.out.println("Enter Msg");
            msg = sc.nextLine();
            dos.writeUTF(msg);
            
            String rcvdMsg = dis.readUTF();
            System.out.println("Server Says : "+rcvdMsg);
        }
        
        dos.close();
        dis.close();
        is.close();
        os.close();
        s.close();
    }
}
