package DS_and_Algo.Arrays_ArraysLists.Arraylists;

import java.util.ArrayList;

public class Operation_Arraylists {
    public static void main(String[] args) {
//        int [] arr = new int[size]; Array
//        int [] arr = {1,23,34,5};
//        double[] arr = {4.98,5.098,6.456};

        ArrayList<Integer> al = new ArrayList<>(8); // al :array list name of var
        al.add(0,10); //arr[0] = 10
        al.add(1,90);
        al.add(2,20);
        al.add(3,30);
        al.add(4,40);
        al.add(5,50);
        al.add(6,60);
        al.add(7,70);
        al.add(8,80);

//        System.out.println(al);
       // System.out.println(al.get(al)); // al[0]

//        System.out.println(al.size()); // to know the size of al
        for (int i = 0; i <=8; i++) {
            System.out.print(al.get(i)+ " "); // al[i]
        }
// Update  in Arraylists
        System.out.println();
        al.set(2,450); // modify
        for (int i = 0; i <al.size(); i++) {
            System.out.print(al.get(i)+ " "); // al[i]
        }
        al.add(90); // push back
        System.out.println();
//        System.out.println(al.size()); // to know the size al
        for (int i = 0; i <al.size(); i++) {
            System.out.print(al.get(i)+ " "); // al[i]
        }
    }
}


//        difference of Array and Arraylists
// preferable add from backsides
// we can grow array in arraylist
// add , get , set
//        in Array if we do  not given any value to index to Assume Default 0
//        in ArrayList if we do  not given any value to index to Assume Default give Exception of index size

//        use set to modify