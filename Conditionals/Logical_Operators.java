package Conditionals;
import java.util.*;
public class Logical_Operators {
//    && and ||
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
      if(n>99 && n<1000) System.out.println("Its is three digits number");
      if(n>=1000 && n<10000) System.out.println("Its a four digit number");
        System.out.println(n);
    }
}
// Take positive integer input and tell if it is a five digit number or not
