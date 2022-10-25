/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 *
 * @author alumnos
 */
public class algoritmosCifras {
    //metodo que devuelve el numero de cifras de un numero ingresado entero 
    public int calcularCifras(int numero) {
        int acum = 0;
        numero = Math.abs(numero); //transforma un valor negativo en su valor absoluto
        if (numero < 10) {
            return 1;
        } else if (numero >= 10 && numero <= 99) {
            return 2;
        } else {
            for (int i = numero; i > 10; i -= 10) {
                numero = numero / 10;
                acum++;
                if (numero == 0) {
                    break;
                }
            }
            return acum;
        }
    }
}
