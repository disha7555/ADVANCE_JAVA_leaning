import java.net.*;
import java.util.*;
import java.io.*;
public class tcpserver {
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(2223);
        while(true)
        {
            Socket s=ss.accept();
            Random r=new Random();
            int no=r.nextInt();
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);
            dos.writeInt(no);
            dos.close();
            os.close();
            s.close();
            
        }
    }
}
