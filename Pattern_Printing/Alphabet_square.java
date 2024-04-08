package Pattern_Printing;

import java.util.Scanner;

public class Alphabet_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
//        System.out.print("Enter the number of Columns: ");

//        for (int i = 1; i <=n; i++) { // rows
//            for (int j = 1; j <=n; j++) { // cols first runs
//                System.out.print((char) (j+64) +" ");
//            }
//            System.out.println();
//        }

//        HOMEWORK-1
//        for (int i = 1; i <=n; i++) { // rows
//            for (int j = 1; j <=n; j++) { // cols first runs
//                System.out.print((char) (i+64) +" ");
//            }
//            System.out.println();
//        }

//        Homework -2
        for (int i = 1; i <=n; i++) { // rows
            for (int j = 1; j <=n; j++) { // cols first runs
                System.out.print((char) (j+96) +" "); // typecasting
            }
            System.out.println();
        }
    }
}

// 'A' = 65 , 'Z' = 90
// 'a' = 97 , 'z' = 122
// '0' = 48  , '9' = 57