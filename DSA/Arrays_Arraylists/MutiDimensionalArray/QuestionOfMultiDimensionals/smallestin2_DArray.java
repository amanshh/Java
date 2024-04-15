package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class smallestin2_DArray {
    public static void main(String[] args) {
        int arr[][] = {{2,4,6},{5,8,9},{3,4,76},{1,5,3}};
int mx = Integer.MAX_VALUE;
int m = arr.length;
int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                mx = Math.min(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
