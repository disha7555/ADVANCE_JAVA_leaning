import java.net.*;
import java.util.*;
import java.io.*;
public class tcpclient
{
      public static void main(String args[]) throws Exception
    { 
        Socket s=new Socket("localhost",2223);
        InputStream is = s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        System.out.println(dis.readInt());
        is.close();
        s.close();
    }
}
