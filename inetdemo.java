import java.net.*;
public class inetdemo {
    public static void main(String[] args) throws Exception{
            InetAddress inet = InetAddress.getLocalHost();
            InetAddress inet2 = InetAddress.getByName("localhost");
            System.out.println(inet);
            System.out.println(inet2);
            
}
}
