package Practica1;

public class Ej23 {
    public static void main(String[] args) {

    }

    private static boolean estáEnTodasLasColumnas(int[][] m1,int n){
        int filas=m1.length,columnas=m1[0].length;
        for (int i=0;i<filas;i++){
            int contador=0;
            for (int j=0;j<columnas;j++){
                if (m1[i][j]==n)
                    contador++;
            }
            if (contador==0)
                return false;
        }
        return true;
    }
}
