
    import java.net.*;
public class udpserver2 {
    public static void main(String args[]) throws Exception
    {
     DatagramSocket ds=new DatagramSocket(2222);
     byte rd[]=new byte[1024];
     InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp=new DatagramPacket(rd,rd.length);
     ds.receive(dp);
     String str=new String(dp.getData());
     StringBuffer sb=new StringBuffer(str);
     String str2=sb.reverse().toString();
     System.out.println(str2);
     ds.close();
             
    }
}

