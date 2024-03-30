package Basics;

public class Modules_Operators {
    // Modules_Operators : it give us to remainder
    public static void main(String[] args) {
        int a =2 , b =8;
        System.out.println(a%b);
        int x =2 , y =(-8);
        System.out.println(x%y);
        int k =(-2) , l =8;
        System.out.println(k%l);
        // PROPERTIES OF MODULES OPERATORS
        //  a % b = a if [a<b]
        // a % (-b) = a % b
        // (-a) % b = -[a%b]
    }
}
