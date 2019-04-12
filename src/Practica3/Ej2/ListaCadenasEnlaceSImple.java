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
            if (primero==null) { //cambiar por isEmpty(), está asi porque todavia no está implementado
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
            if ()


    }
/*
    @Override
    public void clear() {

    }

    @Override
    public String get(int i) {
        return null;
    }

    @Override
    public int indexOf(String s) {
        return 0;
    }

    @Override
    public int lastIndexOf(String s) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String remove(int i) {
        return null;
    }

    @Override
    public boolean remove(String s) {
        return false;
    }

    @Override
    public String set(int i, String s) {
        return null;
    }
    */

    public int size() {
        return talla;
    }
    public String toString(){
            Nodo aux=primero;
            String[] cadenaFinal=new String[size()];
            for(int i=0;i<cadenaFinal.length;i++){
                cadenaFinal[i]=aux.cadena;
                aux=aux.siguiente;
            }
            return Arrays.toString(cadenaFinal);
    }

}

