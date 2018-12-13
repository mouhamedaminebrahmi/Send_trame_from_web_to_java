/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trame_java;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Brahmi Med Amine
 */
public class Trame_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        final int portNumber = 81;
        ServerSocket serverSocket = new ServerSocket(portNumber);
        while (true) {
            Socket socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line="";
            
            
          
            while ((line = br.readLine()) != null) {
    
               for(int i=1; i<=100; i++){
               System.out.println("Trame : "+"["+i+"]" + " = "+ line);
               // pw.println(line);
                // System.out.println(counter);
                    
            }
            }
            pw.close();
            br.close();
            os.close();
            socket.close();
        }
    }
}


