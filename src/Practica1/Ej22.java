package Practica1;

public class Ej22 {
    public static void main(String[] args) {

    }

    private static int másOlasDeFrío(double[][] v1, int n){
        int olaDeFríoMásReciente=-1,filas=v1.length,numeroOlasDeFrio=0;
        for (int i=0;i<filas;i++){
            int resultado=contarOlasDeFrío(v1[i],n);
            if (resultado>numeroOlasDeFrio) {
                numeroOlasDeFrio = resultado;
                olaDeFríoMásReciente = 1900 + i;
            }
        }
        return olaDeFríoMásReciente;


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
