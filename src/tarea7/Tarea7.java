/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea7;

/**
 *
 * @author Usuario
 */
public class Tarea7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodosTarea mt = new metodosTarea();
        System.out.println("-----Algoritmo divide y venceras-----");
        int numero = 254; //400 + 50 + 2to
        System.out.println(mt.invertirNumero(numero,2));//llamada al metodo invertir numero
        System.out.println("-----Algoritmo con programación dinamica-----");
        int[] valores = new int[]{3, 7, 1, 3, 9};
        System.out.println("Maximo valor de una varilla es: " +mt.corteVarilla(valores, valores.length)); //llamada al metodo corte Varilla
    }
    
}
