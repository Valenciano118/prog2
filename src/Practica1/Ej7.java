package Practica1;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n1 = sc.nextInt();
        if (esPrimo(n1)==true)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }

    public static boolean esPrimo(int n1){
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

