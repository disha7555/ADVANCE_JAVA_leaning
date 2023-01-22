import java.net.*;
import java.util.*;
import java.io.*;
public class tcpclient2 {
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",2226);
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          Scanner sin=new Scanner(System.in);
          int a[]=new int[5];
          for(int i=0;i<5;i++)
          {
              a[i]=sin.nextInt();
              dos.writeInt(a[i]);
          }
          int sum= dis.readInt();
          System.out.println(sum);
          is.close();
          s.close();
          os.close();
          dos.close();
          dis.close();
    }
}
