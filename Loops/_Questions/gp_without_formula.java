package Loops.gp_without_formula;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
//         Display this GP 1,2,4,8,16,32 upto 'n'terms
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 1;
//                for(int i =1;i<=n; i++){
//                    System.out.println(a);
//                    //a = a*2;
//                    a *= 2;

//                hw ---> 3 ,12 ,48
        int n = sc.nextInt();
        int a = 3;
        for(int i =1;i<=n; i++){
            System.out.println(a);
            //a = a*4;
            a *= 4;

                }
    }
}
