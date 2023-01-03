/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea8;

/**
 *
 * @author Usuario
 */
public class metodosTarea {
    public void Hanoi(int n, int origen, int auxiliar, int destino) { //metodo para resolver las torres de hanoi
        if (n == 1) { //si las discos son 1
            System.out.println("mover disco de " + origen + " a " + destino); //se muestra el cambio con el disco unico
        } else {
            Hanoi(n - 1, origen, destino, auxiliar); //llamada recursiva al metodo 
            System.out.println("mover disco de " + origen + " a " + destino); //imprime cada movimiento que se realiza
            Hanoi(n - 1, auxiliar, origen, destino); //llamada recursiva al movimiento para el destino que cambia
        } //fin metodo Hanoi
    }
}
