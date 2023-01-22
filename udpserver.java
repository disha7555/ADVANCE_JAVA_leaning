
    import java.net.*;
public class udpserver {
    public static void main(String args[]) throws Exception
    {
     DatagramSocket ds=new DatagramSocket(2222);
     byte rd[]=new byte[1024];
     InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp=new DatagramPacket(rd,rd.length);
     ds.receive(dp);
    // byte str2[]=dp.getData();
     // String str=new String(str2);
     String str=new String(dp.getData());
     System.out.println(str);
     ds.close();
             
    }
}

