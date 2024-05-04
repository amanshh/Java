package Time_and_Space_Complexity.java.Questions.Sorting;

import java.util.Arrays;

public class Selection_insertion_sort { // sorting in selection such as max or min index
    public static void main(String[] args) {
        int arr[] = {3, 0, 5, 2, 4};
//        selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void selection(int [] arr){
        for (int i = 0; i <arr.length; i++) {
//            find the max item in the remaining array and swap with correct index.
            int last = arr.length-i-1;
            int maxIndex = getMaxindex(arr,0, last);

            swap(arr, maxIndex, last);
        }
    }
    static  void swap(int[] arr, int first, int second){
//        swap
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
      static int getMaxindex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
