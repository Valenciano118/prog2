package Practica3.Ej4;
/*
public class Diccionario {
    private static class Nodo{
        String cadena;
        int cantidad;
        Nodo siguiente;

        Nodo(String cadena,int cantidad,Nodo siguiente){
            this.cadena=cadena;
            this.cantidad=cantidad;
            this.siguiente=siguiente;
        }

    }
    private int talla;
    private Nodo primero;
    private  Diccionario(Nodo primero){
        this.talla=0;
        this.primero=primero;
    }
    private boolean contiene(String cadena){
        if (talla==0)
            throw new IndexOutOfBoundsException();
        Nodo aux=primero;
        while(aux!=null){
            if (aux.equals(cadena))
                return true;
            aux=aux.siguiente;
        }
        return false;
    }
    private Nodo getNodo(String s){
        if (talla==0)
            throw new IndexOutOfBoundsException();
        Nodo aux=primero;
        while (aux!=null){
            if (aux.cadena.equals(s))
                return aux;
            aux=aux.siguiente;
        }
    }
    public void añadir(String unaCadena, int unaCantidad){
        if(talla==0){
            primero=new Nodo(unaCadena,unaCantidad,null);
        }
        else if(contiene(unaCadena)){
            Nodo aux=getNodo(unaCadena);
            aux.cantidad+=unaCantidad;
        }
        else{
            Nodo aux=primero;
            while(aux!=null){
                if (unaCadena.compareTo(aux.cadena)>=0){


                }
                aux=aux.siguiente;
            }

        }

    }
}
*/
