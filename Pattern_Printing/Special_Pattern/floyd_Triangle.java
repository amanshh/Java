package Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

       int a = 1;
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= i; j++) { // cols
                System.out.print(a + " "); // even -1 (2*j -1)
           a++;
            }
            System.out.println();
        }
    }
}
