import java.net.*;
public class inet1
{
    public static void main(String[] args) throws Exception
    {
            InetAddress inet1 =  InetAddress.getByName("localhost");
            InetAddress inet2 = InetAddress.getByName("localhost");
            System.out.println(inet1);
            System.out.println(inet2);
             System.out.println(inet1.equals(inet2));
            System.out.println(inet1.isMulticastAddress());
            System.out.println(inet1.getHostAddress());
            System.out.println(inet1.getHostName());
            System.out.println(inet1.toString());
    }      
}
