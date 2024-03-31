package Conditionals;

import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0) System.out.println(-a);
        else System.out.println(a);
    }
}
