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

    public Diccionario() {
        this.talla = 0;
        this.primero = null;
    }

    //METODOS PRIVADOS
    private int size() {
        return talla;
    }

    private boolean isEmpty() {
        if (size() == 0)
            return true;
        return false;
    }

    private boolean contiene(String s) {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        Nodo aux = primero;
        while (aux != null) {
            if (s.equals(aux.cadena))
                return true;
            aux = aux.siguiente;
        }
        return false;
    }

    private Nodo getNodo(String s) {
        Nodo aux = primero;
        while (aux != null) {
            if (s.equals(aux.cadena))
                return aux;
            aux = aux.siguiente;
        }
        return null;
    }

    //METODOS PUBLICOS
    public void añadir(String unaCadena, int unaCantidad) {
        if (size() == 0) {
            primero = new Nodo(unaCadena, unaCantidad, null);
        } else {
            Nodo aux = getNodo(unaCadena);
            if (aux != null)
                aux.cantidad += unaCantidad;
            else {
                aux = primero;
                boolean cambiado = false;
                while (!cambiado && aux.siguiente != null) {
                    if (unaCadena.compareTo(aux.cadena) < 0) {
                        aux = new Nodo(unaCadena, unaCantidad, aux.siguiente);
                        cambiado = true;
                    }
                    aux = aux.siguiente;
                }
                if(!cambiado)
                    aux.siguiente=new Nodo(unaCadena,unaCantidad,null);
            }
        }
        talla++;
    }
}

