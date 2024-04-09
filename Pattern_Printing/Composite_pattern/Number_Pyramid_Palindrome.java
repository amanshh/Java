package Pattern_Printing.Composite_pattern;

import java.util.Scanner;

public class Number_Pyramid_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j<=n-i; j++) { // columns
                System.out.print(" " + " "); // adding spaces
            }

            for (int j = 1; j<=i; j++) { // Concept
                System.out.print(j + " "); // adding stars
            }

            for (int j =i-1; j>=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    }

