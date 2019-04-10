package Practica1;
public class Ej14 {
    public static void main(String[] args) {
        int[] v1={1,2,3,4,5,6,7,8,9,10};
        prueba(v1,5,5);
        prueba(v1,0,-1);
        prueba(v1,11,-1);
        prueba(v1,1,1);


    }

    private static int últimaPosición(int[] v1, int n1){
        int posición=-1;
        for(int i=0;i<v1.length;i++){
            if (v1[i]==n1)
                posición=i+1;
        }
        return posición;
    }
    private static void prueba(int[] v1,int n1,int esperado){
        int resultado;
        resultado=últimaPosición(v1,n1);
        if (resultado==esperado)
            System.out.format("El valor recibido con la función últimaPosición es \"%d\" que es el esperado",resultado);
        else
            System.out.format("El valor recibido con la función últimaPosición es \"%d\" que no era  el esperado",resultado);
        System.out.println();
    }

}
