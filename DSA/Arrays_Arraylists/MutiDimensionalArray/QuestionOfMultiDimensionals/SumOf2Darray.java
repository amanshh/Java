package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class SumOf2Darray {
    public static void main(String[] args) {
int arr [] [] = {{1,2,3},{2,4,6},{3,6,9},{4,8,12}};
int sum = 0;
int mx = Integer.MIN_VALUE; // very smallest value
int m = arr.length; // rows in 2-d array
int n = arr[0].length; // columns in 2-d array
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n; j++) {
                mx = Math.max(mx,arr[i][j]);
                sum += arr[i][j]; // logic to sum all numbers
            }
        }
        System.out.println("Max is : "+mx);
        System.out.print("Sum is : "+sum);
    }
}
