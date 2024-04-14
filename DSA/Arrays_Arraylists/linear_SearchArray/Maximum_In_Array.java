package DS_and_Algo.Arrays_ArraysLists.linear_SearchArray;

public class Maximum_In_Array {
    public static void main(String[] args) {
//        int arr [] = {12,34,56,43,-23,43,57};
////        method-1
//        int n = arr.length;
//        int mx = arr[0];
//        for (int i = 0; i <n; i++) { // read all numbers
//            if(arr[i]>mx) mx = arr[i]; // concept to check max numbers
//        }
//        System.out.println(mx);

//        method-2
        int arr [] = {-12,-34,-453,-56,-43,-23,-43,-57};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) { // read all numbers
          //  if(arr[i]>mx) mx = arr[i]; // concept to check max numbers
        // OR
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
