package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class Rotate2_Array {
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }  // function create


    public static void main(String[] args) {
        int arr[][] = {{2, 3, 4}, {4, 6, 8}, {5, 10, 15}};
        int m = arr.length;
        int n = arr.length;
        print(arr);
        System.out.println();
//transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        System.out.println();
//        rotate --. reverse each row
        for (int i = 0; i < m; i++) {
            int a = 0;
            int b = m - 1;
            while (a < b) {
//            swap arr[i][a] and arr [i][b]
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        print(arr);
    }
}