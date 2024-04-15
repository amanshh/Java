package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

import java.util.Scanner;

public class store_roll_num_and_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][2];
        System.out.print("Enter the Roll_no first and then marks: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}