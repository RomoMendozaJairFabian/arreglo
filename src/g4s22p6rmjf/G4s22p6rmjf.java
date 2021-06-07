/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6rmjf;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ana Cecilia
 */
public class G4s22p6rmjf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        lista.forEach(contenido ->{
            System.out.println("El valor contenido es " + contenido);
            
        });
        
        lista.add("F");
        lista.add("G");
        
        System.out.println("\n segunda forma de trabajar recorridos de listas \n");
        for(String contenido1 : lista){
            System.out.println("El valor contenido es"+ contenido1);
        }
           lista.add("Fernando");
           lista.add("Lista muy larga");
           lista.add("Casa");
           lista.add("segunda linea muy larga y sin problemas de almacenamiento");
           
            System.out.println("\n tercer forma de trabajar recorridos de listas \n");
            
            lista.stream().forEach(contenido2 -> {  
                System.out.println("El valor contenido es"+ contenido2);
            });
            
            
        }
        
    }
    

