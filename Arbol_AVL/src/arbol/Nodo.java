/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Lis
 */
public class Nodo<T> {

    public Nodo(T objeto) {
        this.objeto = objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public void setPadre(Nodo<T> padre) {
        this.padre = padre;
    }

    public void setHojaIzquierda(Nodo<T> hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public void setHojaDerecha(Nodo<T> hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

    public T getObjeto() {
        return objeto;
    }

    public Nodo<T> getPadre() {
        return padre;
    }

    public Nodo<T> getHojaIzquierda() {
        return hojaIzquierda;
    }

    public Nodo<T> getHojaDerecha() {
        return hojaDerecha;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   private T objeto;
   private Nodo<T> padre;
   private Nodo<T> hojaIzquierda;
   private Nodo<T> hojaDerecha;
}
