import java.net.*;
public class udpclient {
    public static void main(String args[]) throws Exception
    {
     DatagramSocket ds=new DatagramSocket();
     byte sd[]=new byte[1024];
     String str="hi";
     sd=str.getBytes();
     InetAddress n=InetAddress.getLocalHost();
     // System.out.println(n);
     DatagramPacket dp=new DatagramPacket(sd,sd.length,n,2222);
     ds.send(dp);
     ds.close();
             
    }
}
