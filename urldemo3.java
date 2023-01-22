import java.net.*;
import java.util.Date;
public class urldemo3 
{
    public static void main(String[] args) throws Exception
    {
        URL url=new URL("https://www.google.com:8080/search?source=hp8ei=H EOX");
        URLConnection urlcon=url.openConnection();
       System.out.println(urlcon.getExpiration());
       System.out.println(urlcon.getDate());
       System.out.println(urlcon.getContentType());
       System.out.println(urlcon.getContentLength());
       long d1=urlcon.getDate();
       System.out.println(new Date(d1));
   
    }
}
