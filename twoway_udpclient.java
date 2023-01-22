import java.net.*;
public class twoway_udpclient {
    public static void main(String args[]) throws Exception
    {DatagramSocket ds=new DatagramSocket(3333);
     byte sd[]=new byte[1024];
     String str="hi";
     sd=str.getBytes();
     InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp=new DatagramPacket(sd,sd.length,n,2222);
     ds.send(dp);
     
       
//     DatagramSocket ds1=new DatagramSocket(2222);
     byte rd[]=new byte[1024];
     //String str="hi";
    // sd=str.getBytes();
    // InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp1=new DatagramPacket(rd,rd.length);
     ds.receive(dp1);
     String msg=new String(dp1.getData());
     System.out.println(msg);
     ds.close();
             
    }
}
