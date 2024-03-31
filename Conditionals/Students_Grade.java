package Conditionals;

import java.util.Scanner;

public class Students_Grade {
    public static void main(String[] args) {
        System.out.println("Enter your Total marks : ");
    Scanner sc = new Scanner(System.in);
    int m1 = sc.nextInt();
if(m1>=81) System.out.println("Very Good");
else if(m1<81 && m1>=60) System.out.println("Good");
else if(m1<60 && m1>45) System.out.println("Average");

else System.out.println("POOR");
}
}
//NOTE power of else if mind it
