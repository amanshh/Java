package Loops._Questions;

import java.util.Scanner;

public class count_given_number {
    public static void main(String[] args) {
//        Hint ==> divide 'n' by 10 again and again
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int count = 0;
        while(n!=0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}