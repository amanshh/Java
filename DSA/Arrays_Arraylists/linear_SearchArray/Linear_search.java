package DS_and_Algo.Arrays_ArraysLists.linear_SearchArray;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Size : ");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.print("Enter Array elements : ");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

//         solution Simplest Code
        boolean flag = false; // flag means not found
        for (int i = 0; i < m; i++) {
            if (arr[i] == n) { // Concept
//            System.out.print("Element Found");
                flag = true; // true means found
                break;
            }
        }
        if (flag==true) System.out.println("Element Found");
        else System.out.println("Element not Found");
    }
}