package Pattern_Printing.Triangles_and_horizontally;

import java.util.Scanner;

public class Homeworks {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= i; j++) { // cols first runs
//                System.out.print((char)(j+64) + " "); // typecasting
//            }
//            System.out.println();
//        }
// hw-2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= i; j++) { // cols first runs
//                System.out.print((char)(j+96) + " "); // typecasting
//            }
//            System.out.println();
//        }
//    hw-3
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter n : ");
//    int n = sc.nextInt();
//    for (int i = 1; i <= n; i++) { // rows
//        for (int j = 1; j <= i; j++) { // cols first runs
//            System.out.print(j + " "); // typecasting
//        }
//        System.out.println();
//    }
//    }

    //    HW-4 mirror images patterns
//public static void main(String[] args) {
//
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter n : ");
//    int n = sc.nextInt();
//    for (int i = 1; i <= n; i++) { // rows
//        for (int j = 1; j <=n+1-i; j++) { // cols first runs
//            System.out.print((char)(j+48) + " "); // typecasting
//        }
//        System.out.println();
//    }
//}
//    HW-5 opposite of HW-4
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= n + 1 - i; j++) { // cols first runs
//                System.out.print((char)(j + 64) + " "); // typecasting
//            }
//            System.out.println();
//        }
//    }
//}

// HW-6
//public static void main(String[] args) {
//
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter n : ");
//    int n = sc.nextInt();
//    for (int i = 1; i <= n; i++) { // rows
//        for (int j = 1; j <= n+1-i; j++) { // cols first runs
//            System.out.print((char) (i+64) + " "); // typecasting
//        }
//        System.out.println();
//    }
//}
// HW-7 opposite of hw-6
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) { // rows
        for (int j = 1; j <=n+1-i; j++) { // cols first runs
            System.out.print((char)(i+48) + " "); // typecasting
        }
        System.out.println();
    }
}

}

