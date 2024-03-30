package Basics;

import java.util.Scanner;

public class TYPECASTING {
    public static void main(String[] args) {
    // take integer 'x' as input and print half of the number.
       // int x = sc.nextInt();
        // double y = (double)x;
//        System.out.println(y/2);
//         Half of give integer
        // Type casting means exchange datatypes
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        double y = (double)x;
//        System.out.println(y/2);

        double y = sc.nextDouble();
        int x = (int)y;
        System.out.println(x);
    }
}
