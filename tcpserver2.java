import java.net.*;
import java.util.*;
import java.io.*;
public class tcpserver2
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(2226);
        while(true)
        {
          Socket s= ss.accept();
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          int b[]=new int[5];
          for(int i=0;i<5;i++)
              
          {
              b[i]=dis.readInt();
          }
          int sum=b[0]+b[1]+b[2]+b[3]+b[4];
          
          dos.writeInt(sum);
          dos.close();
          dis.close();
          is.close();
          os.close();
          s.close();
        }
    }
    
}
