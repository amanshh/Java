package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays;

public class basics_intro {
    public static void main(String[] args) {
//        2-D arrays is like grid,or it is matrix
//         we can store marks with subject for each students

        int arr [][] = new int[3][4];  // Declaration

// filling
//       10 11 12 14
//        22 44 48 60
//        80 65 78 90
        arr[0][0] = 10;
        arr[0][1] = 11;
        arr[0][2] = 12;
        arr[0][3] = 14;
        arr[1][0] = 22;
        arr[1][1] = 44;
        arr[1][2] = 48;
        arr[1][3] = 60;
        arr[2][0] = 80;
        arr[2][1] = 65;
        arr[2][2] = 78;
        arr[2][3] = 90;
        System.out.println(arr[0][2]);
        System.out.println(arr[2][2]);


//        int [][] arr = {{1,2,2,3},{6,3,4,5},{8,3,3,3}}; // Initialization
//         In Java,in 2D Array, if we are directly initialising it, then we do not mention the no.of rows and the no.
//        columns, but if we are only declare and allocating the memory, then we need to mention both the rows and columns.


    }
}
