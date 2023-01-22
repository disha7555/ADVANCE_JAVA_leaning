/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenis_sir;

import java.net.*;
import java.io.*;
public class URLExDemo {
    public static void main(String[] args) throws Exception {
        
        
        /*URL Class Example*/
        URL url = new URL("https://ljku.edu.in/alumni");
        System.out.println("URL File Path:    "+url.getFile());
        System.out.println("URL Authority :    "+url.getAuthority());
        System.out.println("URL Host :    "+url.getHost());
        System.out.println("URL PATH :    "+url.getPath());
        System.out.println("URL User info :    "+url.getUserInfo());
        System.out.println("URL Refernce :    "+url.getRef());
        
        /*URL CONNECTION EXAMPLE*/
        URLConnection con = url.openConnection();
        
        System.out.println("-Class--"+con.getClass());
        System.out.println("-Content Type--"+con.getContentType());
        System.out.println("-Content Encoding--"+con.getContentEncoding());
        System.out.println("-Content Length--"+con.getContentLength());
        InputStream is = con.getInputStream();
        
        int i; 
        while((i=is.read())!=-1){
        
           System.out.print((char)i);
        }
        
        
        
    }
}
