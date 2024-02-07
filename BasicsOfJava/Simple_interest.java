package BasicsOfJava;

import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        float p =sc.nextFloat();
        System.out.println("Enter the rate of Interst :");
        float r = sc.nextFloat();

        System.out.println("Enter the Time");
        Float t = sc.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("Principle:" +p);
        System.out.println("Interst:" +r);
        System.out.println("Time:" +t);
        System.out.println("Simple Interst:" +si);
    }
}



