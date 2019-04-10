package Practica1;
import java.util.Arrays;
public class Ej20 {
    public static void main(String[] args) {
        int[] v1={1,2,3,4,5,6,7,8,9,10},v2={1,2,3,4,5,6,7,8,9,10};
        prueba(v1,v2,true);
        v2[0]=0;
        prueba(v1,v2,false);
    }




    private static void prueba(int[] v1, int[] v2, boolean esperado){
        boolean resultado=contiene(v1,v2);
        if (resultado==esperado)
            System.out.format("El resultado era el esperado, %b.",resultado);
        else
            System.out.format("El resultado no era el esperado, %b.",resultado);
        System.out.println();
        System.out.format("v1=%s %n v2=%s",Arrays.toString(v1),Arrays.toString(v2));
        System.out.println();
    }

    private static boolean contiene(int[] v1,int n){
        for (int i=0;i<v1.length;i++){
            if (v1[i]==n)
                return true;
        }
        return false;
    }
    private static boolean contiene(int[] v1, int[] v2){
        for (int i=0;i<v2.length;i++){
                if (contiene(v1,v2[i])==false)
                    return false;
        }
        return true;
    }
}
