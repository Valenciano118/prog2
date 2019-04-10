package Practica1;

public class EJ16 {
    public static void main(String[] args) {
        double[] v1={-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,5.0,3.0,4.0,-1.0,-1.0,-1.0,5.0,7.0,-1.0,-1.0,-1.0,-1.0};

        prueba(v1,3,2);
        prueba(v1,1,3);
        prueba(v1,2,3);
        prueba(v1,4,1);
        prueba(v1,5,1);
    }


    private static void prueba(double[] v1, int n, int esperado){
        int resultado=contarOlasDeFrío(v1,n);
            if (resultado==esperado)
                System.out.format("El resultado es el esperado. da %d",resultado);
            else
                System.out.format("El resultado no es el esperado, da %d, y no %d",resultado,esperado);
        System.out.println();
    }





    private static int contarOlasDeFrío(double[] v1,int n){
        int aux=1,contador=0;
        for (int i=0;i<v1.length-1;i++){
           if (v1[i]<=0 && v1[i+1]<=0)
               aux++;
           if(v1[i]<=0 && v1[i+1]>0) {
               if (aux>n)
                    contador++;
               aux=1;
           }
        }
        if (aux>n)
            contador++;
        return contador;
    }
}
