package BasicsOfJava;


// Importance to taking input;
import java.util.Scanner;


public class INPUT_taking {
    public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");


        Double radius = sc.nextDouble();
double pi_ =3.1415;
        double area = pi_* radius * radius;

        System.out.println("The Area of Circle is : "+area);
    }
}
