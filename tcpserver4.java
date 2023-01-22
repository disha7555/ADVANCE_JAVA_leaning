import java.net.*;
import java.util.*;
import java.io.*;
public class tcpserver4
{
    public static void main(String args[]) throws Exception
    {
       ServerSocket ss=new ServerSocket(2229);
       while(true)
       {
          Socket s= ss.accept();
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          int d=0;
          int w=0;
          int a=0;
          String str1=dis.readUTF();
          for(int i=0;i<str1.length();i++)
           {
              if(Character.isDigit(str1.charAt(i)))
              {
                  d=d+1;
              }
              if(Character.isWhitespace(str1.charAt(i)))
              {
                  w=w+1;
              }
                if(Character.isAlphabetic(str1.charAt(i)))
              {
                  a=a+1;
              }
            }
          dos.writeInt(d);
          dos.writeInt(a);
          dos.writeInt(w);
          dos.close();
          dis.close();
          is.close();
          os.close();
          s.close();
        }
         
    }
}  
