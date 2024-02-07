package BasicsOfJava;
import java.util.Scanner;
public class Sum_of_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x = sc.nextDouble();
        System.out.println("Enter the Second number : ");
        double y= sc.nextDouble();
        double z = x+y;
        System.out.println("The sum of two number is :"+z);
    }
}
