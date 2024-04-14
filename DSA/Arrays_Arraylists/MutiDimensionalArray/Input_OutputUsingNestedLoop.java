package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays;

import java.util.Scanner;

public class Input_OutputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [][] = new int[3][4];

        int m = arr.length; // Number of Rows or lines // length operator
        System.out.print("Number of Rows : "+ m);
        System.out.println();
        int n = arr[0].length; // Number of Columns
        System.out.print("Number of Columns : "+ n);

//        System.out.println("Enter the 9 elements : ");
//        Input of 2-D Array
//        for (int i = 0; i <3; i++) {
//            for (int j = 0; j < 4; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
////        Output of 2-D Arrays
//        for (int i = 0; i <3; i++) {// rows
//            for (int j = 0; j <3; j++) { // columns
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
