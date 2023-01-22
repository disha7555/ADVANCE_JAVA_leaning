import java.net.*;
public class urldemo 
{
    public static void main(String[] args) throws Exception
    {
        URL url=new URL("https://www.google.com:8080/search?source=hp8ei=H_Eox");
        System.out.println(url.getClass());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getHost());
   
    }
 
            
            
}
