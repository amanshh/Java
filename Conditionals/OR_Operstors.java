package Conditionals;

import java.util.Scanner;

public class OR_Operators {
    public static void main(String[] args) {
        System.out.println("Enter the number(1-9) to know best friend or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0 || n < 5) System.out.println("You r just friend");
        if (n>=5 || n < 10) System.out.println("U r best friend ");
    }
}
