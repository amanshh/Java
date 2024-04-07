package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//       100 iterations
        //for(int i =1;i<=100;i++){
//            if(i%2==1){
//            if(i%2!=0){
//                System.out.print(i+" ");
//            }
//        }
        // 50 iterations
//        for (int i = 1; i <= 100; i += 2) {
//            System.out.print(i + " ");
//        }
        //100 iterations (continue)
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}