
import java.net.*;
import java.util.Date;
import java.io.*;
public class urldemo4
{
    public static void main(String[] args) throws Exception
    {
        URL url=new URL("http://www.yahoo.com");
        URLConnection urlcon=url.openConnection();
       System.out.println(urlcon.getExpiration());
       System.out.println(urlcon.getDate());
       System.out.println(urlcon.getContentType());
       System.out.println(urlcon.getContentLength());
       long d1=urlcon.getDate();
       System.out.println(new Date(d1));
       int l=urlcon.getContentLength();
       int ch;
       if(l!=0)
       {
           System.out.println("all content below");
           InputStream input_string=urlcon.getInputStream();
           while((ch=input_string.read())!=-1)
           {
               System.out.println((char)ch);
           }
           input_string.close();
       }
   else
       {
           System.out.println("no content");
       }
    }
}
