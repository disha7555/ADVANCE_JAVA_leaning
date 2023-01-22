 import java.net.*;
public class twoway_udpserver {
    public static void main(String args[]) throws Exception
    { DatagramSocket ds=new DatagramSocket(2222);
     byte rd[]=new byte[1024];
     InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp=new DatagramPacket(rd,rd.length);
     ds.receive(dp);
     String str=new String(dp.getData());
     System.out.println(str);
    
   //  DatagramSocket ds1=new DatagramSocket(3333);
     byte sd[]=new byte[1024];
     String msg="hello";
     sd=msg.getBytes();
     InetAddress i=InetAddress.getLocalHost();
     DatagramPacket dp1=new DatagramPacket(sd,sd.length,i,3333);
     ds.send(dp1);
    // String str=new String(dp.getData());
     //System.out.println(str);
     ds.close();
             
    }
}


    

