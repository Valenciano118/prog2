package Practica1;

import java.util.Arrays;

public class EJ18 {
    public static void main(String[] args) {
        int[] v1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] v2={1,2,3,0,5,6,7,8,9,10,11,12,13,14,15};
        prueba(v1,3,v2);
    }



    private static void prueba(int[] v1, int n, int[] esperado) {
        int[] resultado = eliminarPosición(v1,n);
        if (Arrays.equals(resultado,esperado))
            System.out.format("El resultado es el esperado, da %s", Arrays.toString(resultado));
        else
            System.out.format("El resultado no es el esperado, da %s",Arrays.toString(resultado));
        System.out.println();
    }

    private static int[] eliminarPosición(int[] v1,int n){
        if (n>v1.length-1)
            return v1;
        v1[n]=0;
        return v1;
    }
}
