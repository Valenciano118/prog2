package Practica1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n1 = sc.nextInt(),productorio=1;
        System.out.print("Los números primos menores que "+n1+ " son: ");
        for (int i=2;i<=n1;i++){
            if (es_primo(i)==true)
                productorio*=i;
        }
        System.out.println(11+"# = "+productorio);
    }

    public static boolean es_primo(int n1){
        for (int i = 2; i < n1; i++) {
            int contador = 0;
            if (n1 % i == 0)
                contador++;
            if (contador > 0) {
                return false;
            }
        }
        return true;
    }
}

