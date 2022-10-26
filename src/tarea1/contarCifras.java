/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class contarCifras {
     Scanner sc = new Scanner(System.in);
     
    public void contarForma1()
    { //Metodo para cacular cifras de un numero entero positivo y negativo
        int numero; //declarar tipo de numero que se va a utilizar entero en este caso
        int j = 10; //variable en 10 para las divisiones sucesivas
        int cont = 1; //contar las cifras de un numero empezando el contador en 1 asi el numero ingresado sea el 0
        System.out.print( "Ingrese un numero: " ); //mensaje que se muestra en pantalla para ingresar el numero
        numero= sc.nextInt(); //permite ingresar el numero por teclado
        int almacenarNumero = numero; //guarda el numero ingresado por teclado
        numero = Math.abs(numero); //transforma un valor negativo en su valor absoluto
        while (numero >= j) { //ciclo while para realizar divisiones sucesivas hasta que el numero ingresado sea mayor igual que 10         
            numero = numero / j; //toma el numero ingresado y el igual al numero dividido para 10
            cont++; //cada que se realice una division  se incrementa el contador en 1
        }//fin ciclo while
        System.out.println( "El numero: " +almacenarNumero+ " tiene " +cont+ " cifras" ); //impresion numero ingresado y numero de cifras//
    }//fin medoto contarForma1
    public void contarForma2()
    {//Metodo para cacular cifras de un numero float positivo y negativo
        float numero;
        System.out.print( "Ingrese un numero: " ); //mensaje que se muestra en pantalla para ingresar el numero
        numero= sc.nextFloat(); //permite ingresar el numero por teclado
        String cadena = numero + ""; //asigna una cadena tipo string al numero ingresado
        cadena = cadena.replace(".", ""); //elimina elementos repetidos como el .
        cadena = cadena.replace("-", ""); //elimina signo negativo 
        System.out.println(cadena.length()); //imprime el tamaño de la cadena mediante la funcion .length()
    }//fin metodo contarForma2
               
}//fin clase principal
