package Conditionals;
import java.util.*;
public class greatest_of_them {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter third Number : ");
        int c = sc.nextInt();

//        if(a>=b && a>=c) System.out.println("Greatest Number is : "+ a);
//
//        if(b>=a && b>=c) System.out.println("Greatest Number is : "+ b);
//        if(c>=a && c>=b) System.out.println("Greatest Number is : "+ c);
//   ----------------------OR-------------------
//        else if(b>=a && b>=c)
//            System.out.println(b+ " is Greatest " );
//        else System.out.println(c+ " is Greatest " );
//--------------------------- without using logical operators ---------------

        if (a > b) {
            if (a > c) System.out.println(a + "is gratest");
            else System.out.println(c + " is greatest ");
        }
if ( b> a) {
    if(b>c) System.out.println(b+"is greatest");
    else System.out.println(c+"is greatest");
}

// lEAST OF THREE NUMBERS

    }
}
