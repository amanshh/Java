package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class largestelement_in2DArray {
    public static void main(String[] args) {
        int arr [][] = {{2,3,4},{6,7,98},{8,4,6}};
        int mx = Integer.MIN_VALUE; // vey small value in java is: Integer.MIN_VALUE
        int m = arr.length;
        int n = arr[0].length; // to know the columns

        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                mx =Math.max(mx,arr[i][j]); // (current mx, arr[] [])
            }
        }
        System.out.print(mx);
    }
}
