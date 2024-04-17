package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class row_and_columns_wise_printing {
    public static void main(String[] args) {
        // Row Wise printing
//        1 2
//        3 4
//        5 6

//        int arr [][] = {{1,2},{3,4},{5,6}};
//        int m = arr.length;
//        int n = arr[0].length;
//        for (int i = 0; i <m; i++) { // Rows
//            for (int j = 0; j <n; j++) { // Columns
//                System.out.print(arr[i][j] + " ");
//            }
//        System.out.println();

// printing Transpose
//columns wise printing   columns first and Row seconds   --> transpose  means where columns constant
 int arr [][] = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;
            for (int j = 0; j <n; j++) { // Columns // n is no of columns  : 2
                for (int i = 0; i <m; i++) { // Rows // m is no of rows  : 3
                System.out.print(arr[i][j] + " ");
            }
//            System.out.println();
        }
    }
}
//Execution of the logic is : arr[0][0],arr[1]arr[0], arr[2][0],sout ,arr[0]arr[1] arr[1][1],arr[2]arr[1]
