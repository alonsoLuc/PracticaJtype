/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FicherosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alo
 */
public class jtype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        System.out.println("Dami el fichero que quieres leer");
        final String ficheroTeclado=sc.next();
        
       try( FileReader fr= new FileReader(ficheroTeclado);
             BufferedReader fichero= new BufferedReader(fr);){//Cierra automáticamente las cosas
           
           
            //1.Crea objeto : stream -character-input
           
             //Otra opcion seria asi
        
           
            //2.Leer la primera linea
            String linea=fichero.readLine();
            if (linea!=null){
                System.out.println("primera linea: "+linea);
            }
            //3. No es necesarui cerrar porque se realiza automáticamente
            
   
            //Nos queda controlar las excepciones haciendo un try y un catch
          }catch(FileNotFoundException e){//Si el fichero no existe
              System.out.println("No encontrado");
              
          }catch (IOException e){ //Lo expecializado se tiene que encotrar arriba xq va a coger lo primero antes
                System.out.println("Error E/S"+e);
            
          }
    
}
}
