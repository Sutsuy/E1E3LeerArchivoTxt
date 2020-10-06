    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasarchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 *
 * @author HP
 */
public class LeerArchivo {
    public void Ordenar(){
        
        List <String> ListaOrdenada= new ArrayList();
        String[] palabrasDeArchivo=null;
         String[] palabrasOriginales=null;
         ArrayList <String> comparacion;
         comparacion = new ArrayList<>();
        ListaOrdenada.add("a sutsuy le gusta leer libros  ");
         
            try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         File archivo = new File ("C:\\Users\\HP\\Documents\\sutsuy\\pruebame.txt");
         FileReader fr = new FileReader (archivo);
         BufferedReader br = new BufferedReader(fr);
         
         String Linea;
         while((Linea=br.readLine())!=null){
         palabrasDeArchivo = Linea.split(" ");
             
         }
         
         
         while((Linea=br.readLine())!=null){
         palabrasOriginales = Linea.split(" ");
             
         }
         
         for (String nombre : ListaOrdenada){
             palabrasOriginales = nombre.split(" ");
         }
         System.out.println("****TEXTO DEL ARCHIVO******");
             System.out.println(" ");
         for (String texto : palabrasDeArchivo){
             
             System.out.println(texto);
         }
         System.out.println("******+TEXTO ORIGINAL*****");
         System.out.println(" ");
         
         for (String texto : palabrasOriginales){
             
             System.out.println(texto);
 
         }
         
         System.out.println("************ITERACIONES***********");
         System.out.println(" ");
         for(int i=0;i<palabrasOriginales.length;i++){
             for(int j=0;j<palabrasDeArchivo.length;j++){
                 if(palabrasOriginales[i].equals(palabrasDeArchivo[j])){
                     comparacion.add(palabrasDeArchivo[j]);
                 }
             }
             System.out.println(comparacion);
             
         }
        
         fr.close();
         System.out.println(" ");
         System.out.println("******************FINAL******************");
          System.out.print(comparacion);
         //separacion del texto contenido en ka f
            }
        
      catch(Exception e){
          System.out.println(e);;
         
      }
            
            
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
        // try{                    
         //   if( null !=fr ){   
         //      fr.close();     
         //   }                  
        // }catch (Exception e2){ 
       //     e2.printStackTrace();
            
         }
      }
        
    
    



