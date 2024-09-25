/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author Alumno-PB203
 */
public class EstructuraControl {
    
    private int edad;
   
    
    

    public EstructuraControl(int edad ) {
        this.edad= edad;
    }
  
       public void  estructura(){
          
           if(this.edad >= 18 && this.edad <=45 ){
               System.out.println("Es mayor de edad");
           }
           else if(this.edad >= 45) {
               System.out.println("Es adulto");
           }
           else{
               System.out.println("Es menor de edad");
           }
                
       }
       
       public void  TablaMultilicar(int d){  
             for(int i =1;i <= 10; i++){
               System.out.println(i+" x " + d +"="+ i*d);
           }
       }
       

}
