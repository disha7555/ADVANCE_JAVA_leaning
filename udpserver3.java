
import java.net.*;
public class udpserver3 {
    public static void main(String args[]) throws Exception
    {
     DatagramSocket ds=new DatagramSocket();
     byte sd[]=new byte[1024];
     String str="hello_world";
     sd=str.getBytes();
     InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp=new DatagramPacket(sd,sd.length,n,2222);
     ds.send(dp);
     ds.close();
             
    }
}
