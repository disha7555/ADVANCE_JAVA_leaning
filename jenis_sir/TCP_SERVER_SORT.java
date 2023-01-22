
package jenis_sir;
  import java.io.*;
import java.net.*;
public class TCP_SERVER_SORT {
    public static void main(String[] args) throws Exception {
        
        int port=2022;
        int j,k;
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();
        int arry[] = new int[5];
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
       
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        for(int i=0;i<5;i++)
        {
            arry[i]= dis.readInt();
        }
        
        for(j=0;j<5;j++)
        {
            for(k=0;k<4;k++)
            {
                if(arry[k]>arry[k+1])
                {
                    int temp;
                    temp=arry[k];
                    arry[k]=arry[k+1];
                    arry[k+1]=temp;
                }
            }
        }
       
        for(int i=0;i<5;i++)
        {
            System.out.print("-"+arry[i]);
        }
        dos.close();
        dis.close();
        is.close();
        os.close();
        s.close();
    }
}


