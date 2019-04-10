package Practica1;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n1=sc.nextInt(),factorial=1;
        for (int i=1;i<=n1;i++){
            factorial*=i;
        }
        System.out.println(n1+ "!" + " = "+factorial);
    }
}
