package Pattern_Printing.Composite_pattern;

import java.util.Scanner;

public class Star_bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int nsp = n-1;// spaces
        int nst = 1;// stars
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=nsp; j++) {
                System.out.print(" " + " "); // adding spaces
            }
            for (int j = 1; j<=nst; j++) { // Concept
                System.out.print("*" + " "); // adding stars
            }
            System.out.println();
        }
    }
    }

