/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION
        String clave, nombre;
        String carrera;
        boolean TipoMateria;
        int creditos, HorasTeoricas, HorasPracticas;
        
        System.out.println("¿Cual es la clave de la materia?");
        //CREAR SCANNER
        Scanner cap = new Scanner (System.in);
        //CAPTURA
        clave = cap.nextLine();
        System.out.println("¿Que nombre tiene tu materia?");
        nombre = cap.nextLine();
        System.out.println("¿De que tipo es tu materia?");
        //TRUE-->GENERICA      FALSE-->
        TipoMateria = cap.nextBoolean();  
        System.out.println("¿Que carrera es?");
        //El next de abajo se pone ya que no se puede el nextLine por el int de arriba
        carrera = cap.next();
        System.out.println("¿Cuantos creditos da la materia?");
        creditos = cap.nextInt();
        System.out.println("¿Cuantas horas teoricas son?");
        HorasTeoricas = cap.nextInt();
        System.out.println("¿Cuantas horas practicas son?");
        HorasPracticas = cap.nextInt();
        //IMPRIMIR
        System.out.println("Tu clave es:");
        System.out.println(clave);
        System.out.println("El nombre de tu materia es:");
        System.out.println(nombre);
        System.out.println("Es un tipo de materia:");
        System.out.println(TipoMateria);
        System.out.println("Tu carrera es:");
        System.out.println(carrera);
        System.out.println("Da estos creditos:");
        System.out.println(creditos);
        System.out.println("Tiene estas horas teoricas:");
        System.out.println(HorasTeoricas);
        System.out.println("Tiene estas horas practicas:");
        System.out.println(HorasPracticas);
    }  
    
}
//Yajaira Daniela Moran Baca