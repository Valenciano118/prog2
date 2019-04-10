package Practica1;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n1 = sc.nextInt(),factorial=1;
        if (n1==1 || n1==0)
            factorial=1;
        else if (n1%2==0){
            for (int i=2;i<=n1;i+=2){
                factorial*=i;
            }
        }
        else {
            for (int i = 1; i <= n1; i += 2) {
                factorial *= i;
            }
        }
        System.out.println(n1+ "!! = "+factorial);
    }

}
