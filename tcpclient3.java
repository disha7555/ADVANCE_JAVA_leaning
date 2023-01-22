import java.net.*;
import java.util.*;
import java.io.*;
public class tcpclient3
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",2227);
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        InputStream is = s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        Scanner sin=new Scanner(System.in);
        String str=sin.nextLine();//we have to use nextLine();b'coz next(); takes input without space
        //next() will not include anything in input if it comes after space.
        
        dos.writeUTF(str);
        System.out.println(dis.readUTF());
        is.close();
        s.close();
       
    }
}
