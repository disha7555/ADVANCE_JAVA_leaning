/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenis_sir;
import java.io.*;
import java.net.*;
public class TCP_DEMO_CLIENT {
    public static void main(String[] args) throws IOException {
        
        String serverIp = "127.0.0.1";
        int port = 2022;
        Socket s = new Socket(serverIp,port);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1200);
        
        
        int data = dis.readInt();
        System.out.println("Data = "+data);
        dos.close();
        dis.close();
        is.close();
        os.close();
        s.close();
       
    }
}


