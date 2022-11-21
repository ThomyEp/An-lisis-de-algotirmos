/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class metodosLibreria {
  
   String isbn;
   float valor;
   String editorial;

    public metodosLibreria(String isbn, float valor, String editorial) {
        this.isbn = isbn;
        this.valor = valor;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getValor() {
        return valor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }  
    
}
