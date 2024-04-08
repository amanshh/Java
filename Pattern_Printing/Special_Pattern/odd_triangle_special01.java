package Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class odd_triangle_special01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//      Method-1
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= i; j++) { // cols
//                System.out.print(2*j-1 + " "); // even -1 (2*j -1)
//            }
//            System.out.println();
//        }

//         method -2
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= 2*i-1; j+=2) { // cols
//                System.out.print(j+ " "); // even -1 (2*j -1)
//            }
//            System.out.println();
//        }

//        method-3
        for (int i = 1; i <= n; i++) { // rows
            int a =1;
            for (int j = 1; j <= i; j++) { // cols
                System.out.print(a + " "); // even -1 (2*j -1)
                a += 2;
            }
            System.out.println();
        }
    }
}