import java.net.*;
import java.util.*;
import java.io.*;
public class tcpclient4 
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",2229);
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        InputStream is = s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        Scanner sin=new Scanner(System.in);
        String str=sin.nextLine();
        dos.writeUTF(str);
        int g=dis.readInt();
         int h=dis.readInt();
          int v=dis.readInt();
          System.out.println("no of digit:" + g);
           System.out.println("no of alphabets:" +h );
            System.out.println("no of whitespaces:" + v);
        // System.out.println(dis.readInt());
        //System.out.println(dis.readInt());
        // System.out.println(dis.readInt());
        is.close();
        s.close();
       dos.close();
       os.close();
       dis.close();
    }
}
