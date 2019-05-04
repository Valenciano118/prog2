package Practica3.Ej4;

public class Diccionario {
    private static class Nodo {
        String cadena;
        int cantidad;
        Nodo siguiente;

        Nodo(String cadena, int cantidad, Nodo siguiente) {
            this.cadena = cadena;
            this.cantidad = cantidad;
            this.siguiente = siguiente;
        }

    }
    private int talla;
    private Nodo primero;

    private Diccionario(Nodo primero) {
        this.talla = 0;
        this.primero = primero;
    }
    //CLASES PRIVADAS
    private int size(){
        return talla;
    }
    private boolean isEmpty(){
        if (size()==0)
            return true;
        return false;
    }
    private boolean contiene(String s){
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        Nodo aux = primero;
        while (aux!=null){
            if(s.equals(aux.cadena))
                return true;
            aux=aux.siguiente;
        }
        return false;
    }
    private Nodo getNodo(String s){
        Nodo aux=primero;
        while(aux!=null){
            if (s.equals(aux.cadena))
                return aux;
            aux=aux.siguiente;
        }
        return null;
    }
    //CLASES PUBLICAS
    public void añadir(String unaCadena,int unaCantidad){
        if(contiene(unaCadena)){
            Nodo aux=getNodo(unaCadena);
            aux.cantidad+=unaCantidad;
        }
        else{

        }
    }
}

