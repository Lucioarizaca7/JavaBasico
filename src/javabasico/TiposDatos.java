/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author Alumno-PB203
 */
public class TiposDatos {
    public void tiposdeDatos1(){
    String myString = "hola";
    int myInteger = 10;
    double myDouble = 0;
    boolean myBolean = true && false ;
    Object myObject = "d" ;
        System.out.println("myString es de tipo  "+ ((Object)myString).getClass().getSimpleName());
        System.out.println("myInteger es de tipo  "+ ((Object)myInteger).getClass().getSimpleName());
        System.out.println("myDouble es de tipo  "+ ((Object)myDouble).getClass().getSimpleName());
        System.out.println("myBolean es de tipo  "+ ((Object)myBolean).getClass().getSimpleName());
        System.out.println("myObject es de tipo  "+ ((Object)myObject).getClass().getSimpleName());
        
    }

   
        
    
}
