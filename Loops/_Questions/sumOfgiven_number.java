package Loops._Questions;

import java.util.Scanner;

public class sumOfgiven_number {
    public static void main(String[] args) {
//        Hint 1> prev ques
        // hint 2> n1 + n2 + n3 +n4
        // n%10 ----> last_digit
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();

        int sum =0;
        while(n!=0){
            int lstd = n%10;
            sum += lstd;
            n /= 10;
            System.out.print(sum);
        }
    }
}
