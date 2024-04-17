package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class Wave_Print {
    public static void print(int[][] arr) {
        int m = arr.length; int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    } // function create

    public static void main(String[] args) {
        int arr [] [] = {{1, 2, 4}, {2, 4, 6}, {3, 6, 9}};
        int m = arr.length; int n = arr[0].length;
        print(arr);
        // wave Print --> row wise (alternate)
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j]+ " ");
                }
        }
        }
    }
}
