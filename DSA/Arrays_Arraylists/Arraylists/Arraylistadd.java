package DS_and_Algo.Arrays_ArraysLists.Arraylists;

import java.util.ArrayList;

public class Arraylistadd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+ " "+list.size());
        list.add(80);
        System.out.println(list+ " "+list.size());
        list.add(50);
        System.out.println(list+ " "+list.size());
        list.add(-40);
        System.out.println(list+ " "+list.size());
        list.add(30);
        System.out.println(list+ " "+list.size());
        list.add(-55);
        System.out.println(list+ " "+list.size());
        list.remove(2);
        System.out.println(list+ " "+list.size());
    }
}
