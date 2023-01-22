package fileserver;

import java.net.*;
import java.util.*;
import java.io.*;
public class fileclient 
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",2231);
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        InputStream is = s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        Scanner sin=new Scanner(System.in);
        String str=sin.nextLine();
        dos.writeUTF(str);
       System.out.println(dis.readUTF());
        is.close();
        s.close();
       dos.close();
       os.close();
       dis.close();
    }
}

