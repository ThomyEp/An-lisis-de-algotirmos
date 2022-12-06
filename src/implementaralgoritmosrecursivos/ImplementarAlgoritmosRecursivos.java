/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementaralgoritmosrecursivos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ImplementarAlgoritmosRecursivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodosRecursivos mr = new metodosRecursivos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de terminos que desea de la serie: ");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print(""+mr.serieFibo(i)+ ",");
        }
        System.out.println("");
        
        int v1[]= {2,5,1,3,10};
        int v2[]= {7,4,6,8,11};
        mr.sortFusion(v1, v2, 0,v1.length-1);
        mr.imprimir(v1);
        
        System.out.println("\n-----");
        mr.imprimir(v1);
        System.out.print("\nIngrese dato a buscar ");
        int dato = sc.nextInt();
        if (mr.busquedaLineal(v1, dato, v2.length-1, 1) !=-1) {
             System.out.println("Elemento existe en la posicion: "+mr.busquedaLineal(v1, dato, v2.length-1, 1));
        }else{
            System.out.println("No existe el dato en el vector");
        }
    }
}
