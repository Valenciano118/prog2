package Practica1;
import java.util.Arrays;
public class Ej19 {
    public static void main(String[] args) {
        int[] v1={1,2,3,5,5,6,7,8,9,10,5,12,5,14,15};
        int[] v2={1,2,3,0,0,6,7,8,9,10,0,12,0,14,15};
        int[] v3={1,1,2,3,4,5,1,1,7,8,1,10,5,12,5,14,1,1};
        int[] v4={0,0,2,3,4,5,0,0,7,8,0,10,5,12,5,14,0,0};
        prueba(v1,5,v2);
        prueba(v3,1,v4);
    }

    private static void prueba(int[] v1, int n, int[] vectorEsperado){
        int[] resultado=eliminarVector(v1,n);
        if (Arrays.equals(resultado,vectorEsperado)) {
            System.out.format("El vector resultante es el esperado, y es: %s", Arrays.toString(resultado));
        }
        else
            System.out.format("El vector resultante no es el esperado, debería ser: %s \n Y ha resultado: \n %s",Arrays.toString(vectorEsperado),Arrays.toString(resultado));
        System.out.println();
    }


    private static int[] eliminarVector(int[] v1,int n){
        for(int i=0;i<v1.length;i++){
            if (v1[i]==n)
                v1[i]=0;
        }
        return v1;
    }
}
