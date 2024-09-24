/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;
import java.util.Scanner;
/**
 *
 * @author Alumno-PB203
 */
public class Practica {
    //switch case 
    public void menu(){
    System.out.println("Elegir una opcion");
    System.out.println("1.Desayuno");
    System.out.println("2.Almuerzo");
    System.out.println("3.Cenas");
    System.out.println("4.Extras");
    System.out.println("5.Salir");
    
    System.out.println("Elegir una opcion: ");
    Scanner sc = new Scanner(System.in);
     int ValorQueInsertaElUsuario = sc.nextInt();
     switch(ValorQueInsertaElUsuario){
        case 1:
            System.out.println("Jugo de Papaya");
            System.out.println("Caldo de Cabeza");
            System.out.println("Lomo saltado");
            break;
        case 2:
            System.out.println("estofado");
            break;
        case 3:
            System.out.println("Pollo a la Brasa");
            break;
        case 4:
            System.out.println("No tenemos extras");
            break;
        case 5:
            System.out.println("Gracias por visitarnos");
        default:
            System.out.println("vuelva pronto");
    }
    }
}
