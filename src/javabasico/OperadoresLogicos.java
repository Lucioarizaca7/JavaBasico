/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author Alumno-PB203
 */
public class OperadoresLogicos {
    public void operador1(){
      boolean esVerdadero = true;
      boolean esFalso = false;
      
      //Operador AND (&&)
      boolean resultado = esVerdadero && esFalso;
        System.out.println("Resultado  AND: "+ resultado);
       //Operador OR (||)
       boolean resultado1 = esVerdadero || esFalso;
        System.out.println("Resultado  OR: "+ resultado1);
       //Operador not ()
      boolean resultado2 = !esVerdadero ;
        System.out.println("Resultado  NOT: "+ resultado2);
    }
   
       
}
