package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
//        Initialization of a 2-D Array
//        3 x 6 matrix
        int[][] arr = {{1, 2, 3, 4, 5, 6}, {2, 4, 6, 8, 10, 12}, {3, 6, 9, 12, 15, 18}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
//     for each loop
//    int [][] a ={{4,8,12,16},{2,4,6,8}};
//    for(int ele:a){
//    for(int x : ele){
//        System.out.print(ele+ " ");
//}
//        System.out.println();
}
