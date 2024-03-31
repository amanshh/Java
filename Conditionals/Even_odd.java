package Conditionals;

import java.util.Scanner;

//Conditionals
// if , if else
//Multiple conditions - && ,||
//Nested if else
//Else if
// Ternary
//Switch
public class Even_odd {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("Even");
//        if(n%2 != 0) System.out.println("Odd");
//        if(n%2 == 1) System.out.println("Odd");
else System.out.println("Odd"); // if (if statement is right then if is only run)
    }
}
