package Practica1;

public class Ej21 {
    public static void main(String[] args) {
        int[] v1={1,2,3,4,7,8,9,10,11,12,13,13,14,15};
        prueba(v1,5,4);
        prueba(v1,7,4);
        prueba(v1,13,10);
        prueba(v1,14,12);
    }
    private static void prueba(int[] v1, int n, int posiciónEsperada){
        int resultado=posiciónInserción(v1,n);
        if (resultado==posiciónEsperada)
            System.out.printf("La posición resultante es la esperada %d ",resultado);
        else
            System.out.printf("La posición resultante no era la esperada, se esperaba %d y ha dado %d",posiciónEsperada,resultado);
        System.out.println();
    }
    private static int posiciónInserción(int[] v1,int n){
        for (int i=0;i<v1.length-1;i++){
            if (n>=v1[i] && n<=v1[i+1])
                return i+1;
        }
        return v1.length-1;
    }
}
