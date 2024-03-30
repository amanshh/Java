package Basics;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int x = (int)ch;
        System.out.println(x);
    }
}
// 'A' = 65 , 'Z' = 90
// 'a' = 97 , 'z' = 122
// '0' = 48  , '9' = 57