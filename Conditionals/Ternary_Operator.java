package Conditionals;

import java.util.Scanner;

public class Ternary_Operator {
    // SYNTAX -->   condition ?  if true : if false
//    REPLACEMENT OF IF ELSE
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();

//    condition ?  if true : if false
    System.out.println((n%2 == 0)? "Even" : "Odd");
}
}
