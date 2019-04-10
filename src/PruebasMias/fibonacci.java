package PruebasMias;
import java.util.Arrays;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        int n1 = sc.nextInt();
        long[] fibonacci = new long[n1];
        fibonacci[0] = fibonacci[1] = 1;
        for (int i = 2; i < n1; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        System.out.println(Arrays.toString(fibonacci));
    }
}