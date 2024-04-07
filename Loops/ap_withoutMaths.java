package Loops;

import java.util.Scanner;

public class ap_withoutMaths {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a = 4 , d = 3;
//        4,7,10,13.....
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a += d;
//            n rounds
        }
    }
}
