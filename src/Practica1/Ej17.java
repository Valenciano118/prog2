package Practica1;

public class Ej17 {
    public static void main(String[] args) {
        int[] v1={1,2,3,4,5,6,7,8,9,10,11,12,12};
        int[] v2={1,2,3,3,4,5,6,7,8};
        int[] v3={1,2,3,4,5,6,7,8,9};
        prueba(v1,false);
        prueba(v2,false);
        prueba(v3,true);


    }


    private static void prueba(int[] v1, boolean esperado) {
        boolean resultado = hayRepetidos(v1);
        if (resultado == esperado)
            System.out.format("El resultado es el esperado, da %s", resultado);
        else
            System.out.format("El resultado no es el esperado, da %s,", resultado,esperado);
        System.out.println();
    }

    private static boolean hayRepetidos(int[] v1){
        int contador;
        for (int i=0;i<v1.length;i++){
            contador=0;
            for (int j=0;j<v1.length;j++){
                if(v1[j]==v1[i])
                    contador++;
            }
            if (contador>1)
                return false;
        }
        return true;
    }
}
