/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaralgoritmosrecursivos;

/**
 *
 * @author Usuario
 */
public class metodosRecursivos {
    
    public int serieFibo(int numero){ //metodo para calcular serie de fibonacci
        if ( numero == 0) { //condicion si el numero ingresado es 0
            return 0; //devolvemos 0
        }else{
            if ( (numero == 1) || (numero == 2) ) { // si numero ingresado es igual a 1 o igual a 2
                return 1;  //devolvemos 1
            }else{
                return (serieFibo(numero-1)+serieFibo(numero-2)); //recursividad 
            } //fin if-else
        }//fin if-else  
    }//fin metodo serieFibo
    
    public void sortFusion(int A[], int B[], int izq, int der) {
        int centro; //variable que almacena el centro del vector
        if (izq < der) { //condicion si izq es menor que der
            centro = (izq + der) / 2; //calcular centro del vector
            sortFusion(A, B, izq, centro); //llamada recursica para la izquierda del vector dividido
            sortFusion(A, B, centro + 1, der); //llamada recursiva para la derecha del vector dividido
            fusion(A, B, izq, centro + 1, der); //llamada al metodo fusion que ordena el vector 
        } //fin if
    }//fin metodo sortFusion
    
    public void fusion(int A[], int B[], int izq, int centro, int der) { //metodo ordenar merge sort
        int final_izq;   //variable para final izquierda
        int nroelem; //variable para numero de elementos
        int tmp; //variable temporal
        final_izq  = centro - 1; // final izq se le asigna centro-1
        tmp = izq; //temporal se le asigna izq
        nroelem = der - izq + 1;//numero de elementos se le asigna der-izq+ 1
        while ((izq <= final_izq) && (centro <= der )){ //mientras se cumplan dos condiciones
            if (A[izq] < A[centro]){ // si a izq es menor a der
                B[tmp] = A[izq]; //b en posicion temporal se asigna a izq
                izq++; //incremento izq en 1
            } else {
                B[tmp] = A[centro];//b en posicion temporal se asigna a centro
                centro++;//incremento centro en 1
            } //fin if-else
            tmp++; //incremento temp en 1
        } //fin while
        while (izq <= final_izq){//mientras se cumplan la condicion
            B[tmp] = A[izq];  //b en posicion temporal se asigna a izq
            tmp++; //incremento temp en 1
            izq++;//incremento izq en 1
        } //fin while         
        while (centro <= der) { //mientras se cumplan la condicion
            B[tmp] = A[centro]; //b en posicion temporal se asigna a centro
            tmp++; //incremento temp en 1
            centro++; //incremento centro en 1
        }//fin while
        for (int i = 1; i <= nroelem; i++) { //recorremo vectores hasta nroelem
            A[der] = B[der]; //a en posicion der se asigna b der
            der--; //decremento der-1
        }//fin for
    } //fin metodo fusion
    
    public int busquedaLineal(int x[],int num, int n, int i){ //metodo busqueda lineal
        if (i ==n+1 )return -1; //si el vector esta vacio  devuelve -1
        else if (x[i]==num)return i; //si el elemento en la posicion i es igual al buscado retorna la posicion
             else return busquedaLineal(x, num, n, i+1); //caso contrario usamos recursividad para recorrer el vector
    } //fin busquedaLineal
     
    
    public void imprimir(int x[]){
        for (int i = 0; i < x.length; i++) {
            System.out.print(""+x[i]+",");
        }
    }
}
