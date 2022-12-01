/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionescomplejidadcomputacional;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class algoritmosComplejidad {
    int n = 2; //tamaño de cada arreglo
    double cubo[][][]; //declaración de arreglo en tres dimensiones
    int matriz [][]; //declaracion de una matriz
    Scanner sc = new Scanner(System.in); //instancia scanner para ingresar datos por teclado
     public void complejidadCubica(){ //Método para llenar un arreglo de tres dimensiones
        cubo = new double[n][n][n]; //inicializar arreglo en tres dimensiones con un tamaño definido en n
         for (int i = 0; i < n; i++) { //recorre filas
             for (int j = 0; j < n; j++) { //recorre columnas
                 for (int k = 0; k < n; k++) { //recorrer paginas
                    System.out.print("Digite un número real: "); //mensaje para llenar con números reales el arreglo
                    cubo[i][j][k] = sc.nextDouble(); // se asigna en orden cada dato ingresado por teclado
                 } //fin for k
             } //fin for j
         } //fin for i
    } //fin método complejidadCubica
     
     public void imprimir(){ //método para imprimir arreglo en tres dimensiones
         for (int i = 0; i < n; i++) { //recorrer filas
             for (int j = 0; j < n; j++) { //recorrer columnas
                 for (int k = 0; k < n; k++) { //recorrer paginas
                     System.out.print(cubo[i][j][k]+","); //mustrar los datos que estan en la posición
                 } //fin for k
                 System.out.println(""); //salto de linea
             } //fin for j
         } //fin for i
     } //fin método imprimir
    
  public int complejidadLogaritmica(int dato, int v[],int tamaño){ //método complejidad logaritmica en base 2 - busqueda binaria
      int centro; //variable para almacenar el centro del vector
      int inferior = 0; //variable para almacenar parte inferior del vector
      int superior = tamaño-1; //variable para almacenar la parte superior del vector
      while (inferior <= superior) {           //mientras la parte inferior sea menor igual que la superior
          centro = (superior+inferior)/2; //calcular valor del centro y ponerla en la variable centro
          if (v[centro]==dato) { //si el dato que se encuentra en la posision centro es igual al dato buscado 
              return centro; //retornamos el centro que es la posición donde se encontró al dato
          }else{ //caso contratio recorremos parte superior e inferior del vector
              if (dato < v[centro]) {  //dato debe ser menor al elemento que este en la posicion centro
                  superior = centro-1; //superior sera igual al centro -1 para la parte supeior
              }else{
                  inferior = centro+1; //inferior sera igual al centro +1 para la parte inferior
              } //fin if- else
          }//fin if else principal
      } //fin while
      return -1; //en caso de no encontrar el elemento retornamos -1 
  } //fin método complejidadLogaritmica   
  
  public void semiLogaritmica(int numero){
      int acumulador = 0; //acumulador inicializado en 0
      int i = 1; //contador i inicializado en 1
      int j; //variable j
      int total; //variable total
      while (i <= numero) {    //mientras contaro i sea menor igual que el número ingresado       
          total = 0; //variable total empieza en 0
          j = numero; //variable j toma el número ingresado
          while (j > 1) { //mientras j sea mayor a 1              
              total+=1; //total sumarle total mas 1
              j/=2; // dividir j para 2 y almanecar en j
          } //fin while j
          System.out.println(""+total); //imprimir variable total
          acumulador+=total; //acumulador sumarle total y guardar en acumulador el resultado
          i+=1; //incrementar i en 1 para no entrar en bucle infinito
      } //fin while i
      System.out.println(numero+ "\n"+acumulador); //imprimir número y acumulador  
  } //fin método semiLogaritmica
  
  public void complejidadConstante(){ //sumatoria con formula
       int suma; //variable para sumatoria
       int numero; //variable para ingresar un número por teclado
       System.out.print("Ingrese un número entero positivo: "); //mensaje pata usuario
       numero = sc.nextInt(); //ingreso de número por teclado
       suma = numero*(numero+1)/2; //calculo de la sumatoria
       System.out.println("Suma enteros desde 1 hasta " +numero+ " : " +suma); //impresion de la sumatoria
  } //fin método complejidadConstante
  
  public void complejidadLineal(){ //método para cañcular sumatoria  desde 1 hasta el número ingresado por el usuario
      int numero;  //variable para ingresar un número por teclado
      int suma = 0; //variable para sumatoria
      System.out.print("Ingrese un número entero positivo: "); //mensaje pata usuario
      numero = sc.nextInt(); //ingreso de número por teclado
      for (int i = 1; i <= numero; i++) { //ciclo for para  realizar operaciones hasta el número ingresado
          suma+=i; //calculo de sumatoria almacenando el dato en suma y sumando i cada vez que se hace el bucle
      } //fin for i
      System.out.println("Suma de enteros desde 1 hasta " +numero+ " : " +suma); //impresion de la sumatoria
  } //fin método complejidadLineal
  
     public void complejidadCuadratica(int filas, int columnas){ //método para ingresar una matriz m x n por teclado
        matriz = new int[filas][columnas]; //inicializar matriz con tamaño m x n con datos del parametro
        for(int f=0;f<filas;f++){ //recorremos las filas
            for(int c=0 ;c<columnas; c++){ //recorremos las columnas
                System.out.print("matriz ["+f+"]["+c+"]:"); //mensaje de la posición de la matriz que se va a llenar
                matriz[f][c] = sc.nextInt(); //ingreso de número por teclado en la posición indicada
            } //fin for c
        } //fin for f
    } //fin método complejidadCuadratica
     
    public void mostrarMatriz(int filas,int columnas){ //método para mostrar datos de una matriz m x n
      System.out.println("La matriz ingresada es: "); //mensaje 
            for (int f = 0; f < filas; f++) {  //recorre las filas de la matriz
            for (int c = 0; c < columnas; c++) { //recorre las columnas de la matriz
                System.out.print(matriz[f][c] + " "); //muesta los números  que se encuentrar en cada posición 
            } //fin for c
            System.out.println(); //salto de linea
        } //fin for f
    } //fin método mostrarMatriz
    
}
