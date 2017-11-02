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
public class Arbol<T>{
    
    public Arbol(T valor){
        root=new Nodo(valor);
    }
    public Arbol(Nodo r){
        this.root=r;
    }
    
    //Métodos//
    public int altura(Nodo actual){
      if(actual==null){
          return 0;
      }
      else{
          return Math.max(altura(actual.getHojaIzquierda()), altura(actual.getHojaDerecha())+1);
      }
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private Nodo root;
}
