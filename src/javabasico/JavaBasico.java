/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.Scanner;

/**
 *
 * @author Alumno-PB203
 */
public class JavaBasico {
    
    public void principal(){
     System.out.println("Bienvenido Java Basico");
     System.out.println("1. Operadores Logicos");
     System.out.println("2. Tipos de datos ");
     System.out.println("3. Estrcuturas de Control ");
     System.out.println("4. Exepciones");
     System.out.println("5. Estructura de Datos");
     
     System.out.println("Elegir una opcion: ");
    Scanner sc = new Scanner(System.in);
     int data = sc.nextInt();
     switch(data){
        case 1:
            OperadoresLogicos opl =  new OperadoresLogicos();
            opl.operador1();
            break;
         case 2:
            TiposDatos tp =  new TiposDatos();
            tp.tiposdeDatos1();
            break;   
      
     }
     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Practica pac = new Practica();
        JavaBasico jb = new JavaBasico();
        JavaBasico cp = new JavaBasico();
        cp.principal();
        //jb.principal();
        //pac.menu();
    }
    
}
