/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_datos;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA1_5_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR NUESTRAS VARIABLES
        String nombre;
        int edad;
        
        System.out.println("Introduce tu nombre:");
     //CREAR NUESTRO SCANNER
     Scanner captura = new Scanner (System. in);
     //CAPTURA
     nombre = captura.nextLine();
     System.out.println("Introduce tu edad:");
     edad = captura.nextInt();
     
     System.out.println("Tu nombre es:");
     System.out.println(nombre);
     System.out.println("Tu edad es:");
     System.out.println(edad);
     
    }
    
}
//Yajaira Daniela Moran Baca
//N.Control: 24550022