/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recusividad;

/**
 *
 * @author alumnos
 */
public class Recusividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodosRecursivos mR = new metodosRecursivos();
        System.out.println("Sin recursividad - iterativa");
        System.out.println("factorial: "+mR.factorial(6));
        System.out.println("Con recursividad");
        System.out.println("factorial: " +mR.factorialRecursivo(6));
        System.out.println("Numero de forma descentende recursivo");
        mR.numeroDescendente(6);
        System.out.println("---Suma recursiva---");
        System.out.println("suma:" +mR.sumaRecursiva(2, 2));
        System.out.println("---Recorrer vector farma recursiva---");
        int m[] = {1,2,3,4,5};
        mR.recorrecVector(m,0);
        System.out.println("---Buscar elemento en un vector---");
        mR.buscarVector(m, 0, 7);
    }
    
}
