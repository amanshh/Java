package Conditionals;
import java.util.*;
public class Triangle_OR_Not {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first side : ");
        int a = sc.nextInt();
        System.out.print("Enter second side : ");
        int b = sc.nextInt();
        System.out.print("Enter third side : ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("This is a Valid triangle");
        else System.out.println("Not a Valid Triangle");
    }
}
