/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filetest;

/**
 *
 * @author Dell
 */
import java.io.*;

public class WriteAFile {
    
    public WriteAFile(String fileN){
        this.wfiles(fileN);
        this.rfiles(fileN);
}
    
    private void wfiles(String fileN){
    
        FileWriter fw;
        FileReader fr;
        try
    {
       fw=new FileWriter(fileN);
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write("Esto es una prueb");
            fw.write(97);
            //Cierro el stream
            fw.close(); 
   }
        catch(IOException ex) 
                {
            System.out.println(ex.getMessage());
        }
        finally
        {
        }
        
    }
private void rfiles(String fileN){
    
        FileReader fr;
        try
        {
         fr=new FileReader(fileN);
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
             fr.close();
        }
        catch(IOException ex) 
                {
            System.out.println(ex.getMessage());
        }
        finally
        {
        }
      }
    
}
