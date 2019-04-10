package Practica1;

import java.util.Arrays;

public class Ej15 {
    public static void main(String[] args) {
        String[] v1 = {"Esto","es","un","vector","de","prueba","no","ordenado"};
        String[] v2 = {"aire","casa","fuego","mar","tierra","tiranosaurio"};
        prueba(v1,false);
        prueba(v2,true);
    }
    private static void prueba(String[] v1, boolean esperado){
        boolean resultado=estáOrdenado(v1);
        if (resultado==esperado)
            System.out.format("El resultado es el esperado, da %b",resultado);
        else
            System.out.format("El resultado no es el esperado, da %b",resultado);
        System.out.println();

    }
    private static boolean estáOrdenado(String[] v1) {
        for (int i=0;i<v1.length-1;i++){
            if(v1[i].compareTo(v1[i+1])>0)
                return false;
        }
        return true;
    }
}
