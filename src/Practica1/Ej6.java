package Practica1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n1 = sc.nextInt(),maximo=0,numeroDivisores=0;
        for (int i=2;i<=n1;i++){
            if (divisores(i)>=numeroDivisores) {
                numeroDivisores = divisores(i);
                maximo=i;
            }
        }
        System.out.println("El número con mas divisores es "+maximo+" ("+numeroDivisores+" divisores)");
    }

    public static int divisores(int n1){
        int contador=0;
        for (int i=1;i<=n1;i++){
            if (n1%i==0)
                contador++;
        }
        return contador;
    }
}

