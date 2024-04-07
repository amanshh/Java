package Loops;

import java.util.Scanner;

public class _break {
    //    Break used to finish/terminate a loop
    public static void main(String[] args) {
        // WAP to check if a number is composite or not
//    Composite --> 2 to n-1 ek factor min hona chahiye
//    6  -> 1,2,3,6

//    A number 'i' is a factor of 'n' if (n%i == 0) --> true
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n: ");
        int n = sc.nextInt();
        int x =0; // 0 means prime
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {  // 'i' is a factor of 'n'
                System.out.println("Composite Number");
          x = 1; // 1 means composite
            break;
            }
            }
        if (n == 1) System.out.println("Neither Prime Nor Composite Number");
       else  if(x==0) System.out.println("Prime Number");
        }
    }
