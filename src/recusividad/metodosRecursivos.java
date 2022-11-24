/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recusividad;

/**
 *
 * @author alumnos
 */
public class metodosRecursivos {
    
    public double factorial(int numero){
        double fact = 1;
        if (numero == 0) {
            fact= 1;
        }else{
            for (int i = 1; i <= numero; i++) {
                fact =fact *i;
            }
        }
        return fact;
    }//fin metodo factorial
    public double factorialRecursivo(int numero){
        if(numero == 0){
            return 1;
        }else{
            return  numero*factorialRecursivo(numero-1);
        }
    }//fin metodo factorialRecursivo
    public void numeroDescendente(int numero){
        if (numero >0 ) { //condicion si el numero es diferente de 0
            System.out.println(""+numero);// forma descendente
            numeroDescendente(numero-1);
            //System.out.println(""+numero);// forma asdescendente
        }//fin if
    }//fin metodo numeroDescendente
    public int sumaRecursiva(int numero1,int numero2){
        if(numero1 == 0){
            return numero2;    
        }else if(numero2 ==0){
            return numero1;
        }else{
            return sumaRecursiva(numero1,numero2-1)+1;
        }
        
    }//fin sumaREcursiva
    
    public void recorrecVector(int v[], int indice){
        
           if (v.length != indice) {
            System.out.println(v[indice]);
            recorrecVector(v, indice + 1);
        }  
    }//fin medoto recorrecVector
    
    public void buscarVector(int v[],int indice,int busc){
       
        if ( indice != v.length) {
            if (v[indice]==busc) {
              System.out.println("Elemento encontrado: " +v[indice]+ " en el indice: " +indice);    
            }
             //System.out.println(v[indice]);
              buscarVector(v, indice+1,busc);
        }else{
            System.out.println("Elemento no encontrado: " +busc);
        } 
    }
}
