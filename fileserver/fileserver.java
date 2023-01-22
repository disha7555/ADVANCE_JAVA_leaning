import java.net.*;
import java.util.*;
import java.io.*;
public class fileserver {
      public static void main(String args[]) throws Exception
    {
       ServerSocket ss=new ServerSocket(2230);
       while(true)
       {
          Socket s= ss.accept();
          OutputStream os=s.getOutputStream();
          DataOutputStream dos=new DataOutputStream(os);
          InputStream is = s.getInputStream();
          DataInputStream dis=new DataInputStream(is);
          String fs="";
          String str="";
          String str1=dis.readUTF();
          File f=new File(str1);
          if(f.isFile())
          {
              FileReader fr=new FileReader(f);
              BufferedReader br=new BufferedReader(fr);
              while((str=br.readLine())!=null)
              {
                  fs=fs+str;
                  
              }
          }
          
          dos.writeUTF(fs);
          dos.close();
          dis.close();
          is.close();
          os.close();
          s.close();
        }
         
    }
}  

