package Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class Special_Pattern02 {
    public static void main(String[] args) {
////        Star Plus
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        int mid = n/2+1;
////        System.out.print("Enter the number of Columns: ");
//
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= n; j++) { // cols first runs
//                if (i==mid || j == mid)
//                    System.out.print("*" + " ");
//                else
//                    System.out.print(" " + " ");
//                }
//                System.out.println();
//            }

//        Star Cross
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
////        System.out.print("Enter the number of Columns: ");
//
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= n; j++) { // cols first runs
//                if (i == j || i+j == n+1)
//                    System.out.print("*" + " ");
//                else
//                    System.out.print(" " + " ");
//            }
//            System.out.println();
//        }

//        Binary Triangle Pattern  -----very imp----
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= i; j++) { // cols first runs
//                if(i%2==1) { // i\f i and j both are odd then print 1
//                    if (j%2==1) System.out.print(1+ " ");
//                    else System.out.print(0 + " ");
//
//                    }
//                else { // i%2 == 0 // if i and j both are even the 1
//                    if (j % 2 == 0) System.out.print(1 +" ");
//                    else System.out.print(0 + " ");
//
//                }
//            }
//            System.out.println();
//        }

//        Alternative method

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) { // rows
//            for (int j = 1; j <= i; j++) { // cols first runs
//                if ((i+j)%2==0) System.out.print(1 + " ");
//                else System.out.print(0 + " ");
//            }
//            System.out.println();
//        }


//        Star Triangle Flipped
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= n; j++) { // cols first runs
if(i+j>n) System.out.print("*" + " ");
else System.out.print("_"+" ");
            }
            System.out.println();
        }
    }
}
