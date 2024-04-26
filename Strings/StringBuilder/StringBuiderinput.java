package DSA_Strings.StringBuilder;

import java.util.Scanner;

public class StringBuilderinput {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder(sc.nextLine());
            System.out.println(sb);
//        important work of StringBuilder setCharAt
            sb.setCharAt(1,'s');
            System.out.println(sb);
        }
    }

