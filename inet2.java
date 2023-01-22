import java.net.*;
public class inet2
{
    public static void main(String[] args) throws Exception
    {
        InetAddress inet1[]=InetAddress.getAllByName("localhost");
        for(InetAddress n:inet1)
        {
            System.out.println(n);
        }
    }
}
