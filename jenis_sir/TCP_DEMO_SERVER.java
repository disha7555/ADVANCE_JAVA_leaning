/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCPIPPrograms;

/**
 *
 * @author Jenis Shah
 */
import java.net.*;
import java.io.*;

public class TCP_DEMO_SERVER {
    
    public static void main(String[] args) throws Exception {
        
        int port=2022;
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
       
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        int data = dis.readInt();
        System.out.println("Data = "+data);
        
        dos.writeInt(data+200);
        dos.close();
        dis.close();
        is.close();
        os.close();
        s.close();
    }
}
