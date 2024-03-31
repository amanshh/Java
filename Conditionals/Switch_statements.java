package Conditionals;

import java.util.Scanner;

public class Switch_statements {
    public static void main(String[] args) {
//        replacement of if else
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();

//        if(op == '+') System.out.println(a+b);
//        if(op == '-') System.out.println(a-b);
//        if(op == '*') System.out.println(a*b);
//        if(op == '/') System.out.println(a/b);

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                    System.out.println(a-b);
                    break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Not a valid operator.");
        }
    }
}
