import java.net.*;
public class urldemo2 
{
    public static void main(String[] args) throws Exception
    {
        String protocol="https";
        String host="www.google.com"; 
        String file="/search?source=hp8ei=H EOX";
        int port=2222;
        URL url=new URL(protocol,host,port,file);
        System.out.println(url.getClass());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getHost());
        System.out.println(url.toExternalForm());
        System.out.println(url.getProtocol());
    }
 
            
            
}
