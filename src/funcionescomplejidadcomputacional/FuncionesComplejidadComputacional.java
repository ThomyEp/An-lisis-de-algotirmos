/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionescomplejidadcomputacional;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FuncionesComplejidadComputacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        algoritmosComplejidad ac = new algoritmosComplejidad(); //instancia de la clase algoritmosComplejidad
         Scanner sc = new Scanner(System.in); //instancia scanner para ingresar datos por teclado
         int opcion;
        do {
            System.out.println("\n-----Menu de opciones-----\n1. O(1)\n2. O(n)\n3. O(n^2)\n4. O(n^3) \n5. O(log n)\n6. O(n log (n))\n7. Salir");
            System.out.print("Escoja un caso:");
            opcion = sc.nextInt(); //ingreso número por teclado
             switch (opcion) { //case, según el caso se llama a la función asignada con la instancia ac. nombre del método a usar
            case 1: 
                System.out.println("Ejemplo de función con complejidad constante O(1)");
                ac.complejidadConstante();
                break;
            case 2:
                System.out.println("Ejemplo de función con complejidad lineal O(n)");
                ac.complejidadLineal();               
                break;
            case 3:
                System.out.println("Ejemplo de función con complejidad cuadrática O(n^2)");
                int filas = 3;
                int columnas = 3;
                ac.complejidadCuadratica(filas, columnas);
                ac.mostrarMatriz(filas, columnas);
                break;
            case 4:
                System.out.println("Ejemplo de función con complejidad cubica O(n^3)");
                ac.complejidadCubica();
                ac.imprimir();
                break;
            case 5:
                System.out.println("Ejemplo de función con complejidad logarítmica O(log n)");
                 int vector [] = {1,2,3,4,5}; //el método requiere un vector ordenado
                int numeroBuscar = 0; //número que se desea buscar en el vector
                if (+ac.complejidadLogaritmica(numeroBuscar, vector, vector.length) != -1) {
                    System.out.println("Elemento encontrado en la posición: " + ac.complejidadLogaritmica(numeroBuscar, vector, vector.length));
                } else {
                    System.out.println("Elemento no existe en el vector");
                }
                break;
            case 6:
                System.out.println("Ejemplo de función con complejidad logarítmica O(n log (n))");
                ac.semiLogaritmica(5);
                break;
            case 7:
                System.out.println("Fin del programa");
                break;    
            default:
                throw new AssertionError();
        } //fin switch
        } while (opcion <=6); //fin do-while
    }
    
}
