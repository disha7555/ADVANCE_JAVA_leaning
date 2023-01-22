import java.net.*;
import java.util.*;
import java.io.*;
public class tcpserver3
{
    public static void main(String args[]) throws Exception
    {
       ServerSocket ss=new ServerSocket(2227);
       while(true)
       {
          Socket s= ss.accept();
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          String fs="";
          String str1=dis.readUTF();
          for(int i=0;i<str1.length();i++)
           {
              if(Character.isUpperCase(str1.charAt(i)))
              {
                  fs=fs+String.valueOf(Character.toLowerCase(str1.charAt(i)));//fs=fs+s or dos.writeUTF();
              }
                  else
              {
                  fs=fs+String.valueOf(Character.toUpperCase(str1.charAt(i)));//fs=fs+s or dos.writeUTF();
              }
                  
            }
          dos.writeUTF(fs);
          dos.close();
          os.close();
          s.close();
        }
         
    }
}  
