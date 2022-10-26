/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in); //sentencia para ingresar valores por teclado
       contarCifras cc = new contarCifras(); //instancia para acceder a los metodos de la clase contarCifras
       int opcion;//opcion para el switch
        System.out.print( "Opciones\n1.Confar cifras forma 1\n2.Contar cifras forma 2\nIngrese una opcion: " );
       opcion = sc.nextInt(); //ingreso por teclado
        switch (opcion) {
            case 1:
                System.out.print( "-----Contar cifras forma 1-----\n" );
                cc.contarForma1();
                break;
            case 2:
                System.out.print( "-----Contar cifras forma 2-----\n" );
                cc.contarForma2();
                break;    
            default:
                throw new AssertionError();
        }
      
       
    }
    
}
