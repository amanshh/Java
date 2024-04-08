package Pattern_Printing;

import java.util.Scanner;

public class square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
//        System.out.print("Enter the number of Columns: ");

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
