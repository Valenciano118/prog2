package Practica3.Ej2;

import java.util.Arrays;

public class ListaCadenasEnlaceSImple {
    private static class Nodo{
        String cadena;
        Nodo siguiente;
        Nodo(String cadena,Nodo siguiente){
            this.cadena=cadena;
            this.siguiente=siguiente;
        }
    }
        private int talla; //número de elementos
        private Nodo primero;

        public ListaCadenasEnlaceSImple(int talla, Nodo primero){
            this.talla=talla;
            this.primero=primero;
        }
    public boolean add(String s) {
        Nodo nuevo = new Nodo(s, null);
            if (isEmpty()) {
                primero=nuevo;
                talla++;
            }
            else{
                Nodo aux=primero;
                while(aux.siguiente!=null){
                    aux=aux.siguiente;
                }
                aux.siguiente=nuevo;
                talla++;
            }
        return true;
    }
    public void add(int i, String s) {
            if(i<0 || i>size())
                throw new IndexOutOfBoundsException();
            /*if(i==size()&& size()>0)
                add(s);*/
            if(i==0){
                Nodo nuevo=new Nodo(s,primero);
                primero=nuevo;
            }
            else{
                Nodo aux=primero;
                for (int posición=0;posición<i-1;posición++){
                    aux=aux.siguiente;
                }
                Nodo nuevo=new Nodo(s,aux.siguiente);
                aux.siguiente=nuevo;
            }
            talla++;
    }

    public void clear() {
    primero=null;
    }

    public String get(int i) {
            if (!isEmpty()){
                int posición=0;
                Nodo aux=primero;
                while(posición<i){
                    aux=aux.siguiente;
                    posición++;
                }
                return aux.cadena;
            }
        return null;
    }

    public int indexOf(String s) {
            Nodo aux=primero;
            int contador=0;
            while(aux!=null){
                if (aux.cadena.equals(s))
                    return contador;
                contador++;
                aux=aux.siguiente;
            }
        return -1;
    }

    public int lastIndexOf(String s) {
            Nodo aux=primero;
            int contador=0,i=-1;
            while(aux!=null) {
                if (aux.cadena.equals(s))
                    i = contador;
                contador++;
                aux = aux.siguiente;
            }
        return i;
    }

    public boolean isEmpty() {
        if (primero==null)
            return true;
        return false;
    }

    public String remove(int i) {
            if(i<0 || i>=size())
                throw new IndexOutOfBoundsException();
            String cadenaEliminada="";
            if (i==0) {
                cadenaEliminada=primero.cadena;
                primero = primero.siguiente;
                talla--;
                return cadenaEliminada;
            }
            Nodo aux=primero;
            for (int contador=0;contador<i-1;contador++){
                aux=aux.siguiente;
            }
            cadenaEliminada=aux.siguiente.cadena;
            if(i==size()-1)
                aux.siguiente=null;
            else
                aux.siguiente=aux.siguiente.siguiente;
            talla--;
            return cadenaEliminada;
    }

    public boolean remove(String s) {
            int i=indexOf(s);
            if (i<0)
                return false;
            remove(i);
        return true;
    }
    public String set(int i, String s) {
        if (i<0 || i>=size())
            throw new IndexOutOfBoundsException();
        if (i==0)
            return null;
        Nodo aux=primero;
        for(int contador=0;contador<=i-1;contador++){
            aux=aux.siguiente;
        }
        String cadenaAnterior=aux.cadena;
        aux.cadena=s;
        return cadenaAnterior;
    }

    public int size() {
        return talla;
    }
    public String toString(){
        if(isEmpty())
            return "[]";
            Nodo aux=primero;
            String[] cadenaFinal=new String[size()];
            for(int i=0;i<cadenaFinal.length;i++){
                cadenaFinal[i]=aux.cadena;
                aux=aux.siguiente;
            }
            return Arrays.toString(cadenaFinal);
    }
}