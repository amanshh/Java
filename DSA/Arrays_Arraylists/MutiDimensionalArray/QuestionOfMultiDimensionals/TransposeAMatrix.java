package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class TransposeAMatrix {
    public static void main(String[] args) {
        int arr [][] = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;
//        for (int j = 0; j <n; j++) { // Columns // n is no of columns  : 2
//            for (int i = 0; i <m; i++) { // Rows // m is no of rows  : 3
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
            //Execution of the logic is : arr[0][0],arr[1]arr[0], arr[2][0],sout ,arr[0]arr[1] arr[1][1],arr[2]arr[1]
//        }
        System.out.println();
//        Storing
        int [][] transpose = new int [n][m];
        for (int i = 0; i <n ; i++) {// columns :  n is no of columns
        for (int j = 0; j <m; j++) { // rows :    m is no of rows
            transpose[i][j] = arr[j][i]; // concept
            System.out.print(transpose[i][j]+ " ");
        }
            System.out.println();
        }
    }
}
