package Pattern_Printing.Triangles_and_horizontally;

import java.util.Scanner;

public class mirror_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= n+1-i; j++) { // cols first runs
                System.out.print("*" + " "); // typecasting
            }
            System.out.println();
        }
    }
}
