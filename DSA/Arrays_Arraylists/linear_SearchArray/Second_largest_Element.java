package DS_and_Algo.Arrays_ArraysLists.linear_SearchArray;

public class Second_largest_Element {
    public static void main(String[] args) {
        int arr[] = {12, 34, 56, 49, -23, 43, 57};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <n; i++) { // read all numbers
            //  if(arr[i]>mx) mx = arr[i]; // concept to check max numbers
            // OR
            mx = Math.max(mx,arr[i]);
        }

        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>smx && arr[i]!=mx) smx = arr[i]; // concept to check max numbers
//           OR
//            if (arr[i] != mx)
//                smx = Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
