package Practica3.Ej3;

import java.util.Arrays;

public class ListaCadenasEnlaceDoble implements ListaCadenas {
    private static class Nodo{
        String cadena;
        Nodo siguiente;
        Nodo anterior;
        Nodo(String cadena,Nodo siguiente,Nodo anterior){
            this.cadena=cadena;
            this.siguiente=siguiente;
            this.anterior=anterior;
        }
    }
    private int talla; //número de elementos
    private Nodo primero;
    private Nodo último;

    public ListaCadenasEnlaceDoble(int talla, Nodo primero){ //Revisar si el ejercicio dice explicitamente como ha de ser el constructor
        this.talla=talla;
        this.primero=primero;
        this.último=primero;
    }
    public Nodo getNodo(int i){
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        if (i<(float)talla/2) {
            Nodo aux=primero;
            for (int cont = 0; cont < talla; cont++) {
                if (cont == i)
                    return aux;
                aux = aux.siguiente;
            }
        }
        else {
            Nodo aux=último;
            for (int cont = talla - 1; cont >= 0; cont--){
                if (cont == i)
                    return aux;
                aux=aux.anterior;
            }

        }
        return null;
    }

    public boolean add(String s) {
        if (isEmpty()){
            primero=último=new Nodo(s,null,null);
        }
        else{
            Nodo aux=getNodo(size()-1);
            último=new Nodo(s,null,aux);
            aux.siguiente=último;
        }
        talla++;
        return true;
    }

    public void add(int i, String s) {
        if(i<0 || i>size())
            throw new IndexOutOfBoundsException();
        if (isEmpty() ||i==size()) {
            add(s);
            talla--; //add(String s) ya suma a talla, con esto se contrarresta. Aunque hay que cambiarlo
        }
        else if (i==0){
            Nodo aux=new Nodo(s,último,null);
            primero=aux;
        }
        /*else if(i==size()){             //añadir al final, también se podría llamar a add (String s).
            Nodo aux=getNodo(size()-1);
            último=new Nodo(s,null,aux);
            aux.siguiente=último;
        }
        */
        else{
            Nodo aux1=getNodo(i);
            Nodo aux2=getNodo(i-1);
            Nodo nuevo=new Nodo(s,aux1,aux2);
            aux1.anterior=nuevo;
            aux2.siguiente=nuevo;
        }
        talla++;
    }


    public void clear() {
        primero = último = null;
        talla = 0;
    }

    public String get(int i) {
        if(i<0 || i>size())
            throw new IndexOutOfBoundsException();
        if (!isEmpty()){
            return getNodo(i).cadena;
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
        if (size()==0)
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
       // Nodo aux=primero;
        //for (int contador=0;contador<i-1;contador++){
          //  aux=aux.siguiente;
        Nodo aux=getNodo(i-1);
        cadenaEliminada=aux.siguiente.cadena;
        if(i==size()-1) {
            aux.siguiente = null;
            último = aux;
        }
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
        if (size()==0)
            return null;
        Nodo aux=getNodo(i);
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
