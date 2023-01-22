
import java.net.*;
import java.util.*;
import java.io.*;
public class TCPCLIENT6_DATE {
     public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",2225);
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          //Scanner sin=new Scanner(System.in);
         // String str=sin.next();
         String str1="give time and date";
         System.out.println(str1);
         dos.writeUTF(str1);
          System.out.println(dis.readUTF());
          
          is.close();
          dis.close();
          dos.close();
          os.close();
          s.close();
    }
}
