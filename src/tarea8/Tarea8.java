/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc = new Scanner(System.in);
        metodosTarea mt = new metodosTarea();
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        mt.Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino  
    }
        
    
}
    
