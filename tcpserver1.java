import java.net.*;
import java.util.*;
import java.io.*;
public class tcpserver1 
{
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
          StringBuffer sb=new StringBuffer(str1);
          String str2=sb.reverse().toString();
          dos.writeUTF(str2);
          is.close();
          dis.close();
          dos.close();
          os.close();
          s.close();
        }
    }
    
}