/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7;

/**
 *
 * @author Usuario
 */
public class metodosTarea {
     public  int invertirNumero(int num, int pos){ //metodo para invertir un numero de 3 cifras
        //Si es menor que 10 devuelvo el numero (el ultimo numero)
        if(num < 10){ 
            return num; 
        }else{
            //Cojo el modulo del numero y lo multiplico por la potencia (4 * 100) por ejemplo
            return (num % 10) * (int) Math.pow(10, pos) + (invertirNumero(num/10, pos-1));
        }
    }//fin metodo invertir numero
     
       public int corteVarilla(int[] valores, int tamañoVector) { //metodo para obtener el valor del corte de una varilla
        int[] subSoluciones = new int[tamañoVector + 1]; //declaracion de un vector
        for (int i = 1; i <= tamañoVector; i++) {
            int tmpMax = -1; //temporal maximo incializado en -1
            for (int j = 0; j < i; j++)
                tmpMax = Math.max(tmpMax, valores[j] + subSoluciones[i - j - 1]); //asignamos a temporal maximo el calculo de las varillas
                subSoluciones[i] = tmpMax; //asignamos al vector el valor de temporar maximo 
        }
        return subSoluciones[tamañoVector]; //devolvemos el vector subsoluciones
    } //fin metodo corteVarilla
}
