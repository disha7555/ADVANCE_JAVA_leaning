import java.net.*;
import java.util.*;
public class array_udpclient {
    public static void main(String args[]) throws Exception
    {
     DatagramSocket ds=new DatagramSocket(3333);
             
     byte sd[]=new byte[5120];
     Scanner sin=new Scanner(System.in);
   //  String str="23 22 ";
   String str=sin.nextLine();
   
     sd=str.getBytes();
     InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp=new DatagramPacket(sd,sd.length,n,2222);
     ds.send(dp);
     ds.close();
             
    }
}

