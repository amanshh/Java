package Pattern_Printing.Triangles_and_horizontally;

import java.util.Scanner;

public class mixture_type_alpha_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= i; j++) { // cols first runs
                if (i % 2 == 0) System.out.print((char)(j+64) +" ");
                if (i % 2 != 0) System.out.print((char)(j+48) +" ");
            }
            System.out.println();
        }
    }
}

// 'A' = 65 , 'Z' = 90
// 'a' = 97 , 'z' = 122
// '0' = 48  , '9' = 57