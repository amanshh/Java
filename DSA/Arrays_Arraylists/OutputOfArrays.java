package DS_and_Algo.Arrays_ArraysLists;

import java.util.Scanner;

public class OutputOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

//       input --> loop
        int [] arr = new int[n];
        for (int i =0; i <=n-1; i++) {
           arr[i] = sc.nextInt();
        }

        //output --> loop
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
