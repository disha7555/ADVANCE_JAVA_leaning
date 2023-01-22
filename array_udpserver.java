
    import java.net.*;
import java.util.Arrays;
public class array_udpserver {
    public static void main(String args[]) throws Exception
    {
     DatagramSocket ds=new DatagramSocket(2222);
     byte rd[]=new byte[5120];
     //InetAddress n=InetAddress.getLocalHost();
     DatagramPacket dp=new DatagramPacket(rd,rd.length);
     ds.receive(dp);
     String str=new String(dp.getData());
     String s[]=str.split(" ");
     int a[]=new int[4];
      for(int i=0;i<4;i++)
     {
         a[i]=Integer.parseInt(s[i]);
     }
    // for(int i=0;i<5;i++)
    // {
    //     System.out.println(a[i]);
    // }
    // String fs=String.valueOf(a);
    String s1="";
    String fs="";
        Arrays.sort(a);
        for(int i=0;i<4;i++)
     {
        s1=String.valueOf(a[i]);
        fs=fs+s1;
     }
     //String str3=Arrays.toString(a);
     System.out.println(fs);
     ds.close();
             
    }
}

