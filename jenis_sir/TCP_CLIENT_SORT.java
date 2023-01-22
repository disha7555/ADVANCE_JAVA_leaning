
package jenis_sir;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TCP_CLIENT_SORT {
    public static void main(String[] args) throws Exception{
        String serverIp ="127.0.0.1";
        int port = 2022;
        int arr []= new int[5];
        Socket s = new Socket(serverIp, port);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
       
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        Scanner sc = new Scanner(System.in);
        
        
        for(int i=0;i<5;i++)
        {
            
            System.out.println("Enter Data "+(i+1));
            arr[i]= sc.nextInt();
            
        }
        
        for(int i=0;i<5;i++)
        {
       
            dos.writeInt(arr[i]);
        }
       
        
        dos.close();
        dis.close();
        is.close();
        os.close();
        s.close();
    }
}
