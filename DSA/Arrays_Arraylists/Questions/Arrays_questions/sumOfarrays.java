package DS_and_Algo.Arrays_ArraysLists;

public class sumOfarrays {
    public static void main(String[] args) {
        int arr [] = {23,45,67,45,63,45,26,45,37,54};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // concept
        }
        System.out.println(sum);
    }
}
