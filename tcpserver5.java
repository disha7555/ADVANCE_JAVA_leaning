import java.net.*;
import java.util.*;
import java.io.*;
public class tcpserver5
{
    public static void main(String args[]) throws Exception
    {
       ServerSocket ss=new ServerSocket(2230);
       while(true)
       {
          Socket s= ss.accept();
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          String str=dis.readUTF();
          
          
//          dos.writeInt();
          dos.close();
          dis.close();
          is.close();
          os.close();
          s.close();
        }
         
    }
}  

