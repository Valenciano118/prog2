package Practica1;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n1 = sc.nextInt();
        boolean primo=true;
        for(int i=2; i<n1; i++){
            int contador=0;
            if (n1%i==0)
                contador++;
            if (contador>0){
                primo=false;
                break;
            }
        }
        if (primo==true)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");

    }
}
