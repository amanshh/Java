package DS_and_Algo.Arrays_ArraysLists.Mutidimensional_Arrays.Questions;

public class Add_two_matrix {
    public static void main(String[] args) {
        int op1 [][] = {{1,2,3,4},{2,4,6,8},{3,6,9,12}};
        int op2 [][] = {{3,2,1,4},{7,6,5,4},{12,9,6,32}};
        int rows = op1.length; // length of rows
        int columns = op2[0].length; // length of columns

        int res [][] = new int[rows][columns]; // store res in op1 and op2
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <columns ; j++) {
               res[i][j] = op1[i][j] + op2[i][j]; // addition performs
                System.out.print(res[i][j]+" ");
            }
            System.out.println(); // take new line after execution of each rows line
        }
    }

}
