package jenis_sir;




import java.io.*;
import java.net.*;
import java.util.*;

public class SERVER_CHATROOM  {
    public static void main(String[] args) throws Exception {
        
        int port=2022;
        String msg="";
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
       
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        Scanner sc = new Scanner(System.in);
        while(!(msg.equals("stop"))){
        
            String rcvdMsg = dis.readUTF();
            System.out.println("Client Says"+rcvdMsg);
            
            System.out.println("Enter Your Reply...");
            msg=sc.nextLine();
            dos.writeUTF(msg);
        }
        dos.close();
        dis.close();
        is.close();
        os.close();
        s.close();
    }
}
