package DS_and_Algo.Arrays_ArraysLists;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int [] arr ={12,13,14,15,20,35};
        System.out.println(arr[0]);
        change (arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] x) {
        x[0] = 10;// pass by refernce
    }
}
