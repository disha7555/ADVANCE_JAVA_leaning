
import java.net.*;
import java.util.*;
import java.io.*;
public class TCPSERVER6_DATE_ {
     public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(2225);
        while(true)
        {
          Socket s= ss.accept();
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          String str1=dis.readUTF();
          Date d=new Date();
          String str="current date-time:"+d;
          dos.writeUTF(str);
          is.close();
          dis.close();
          dos.close();
          os.close();
          s.close();
        }
    }
}
