package Strings;

public class substrings {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvqxyz";
//        substring is the continues parts of String such as:  a, ab, abc, abcd
        System.out.println(s.substring(2)); // included index  afters indexs
        System.out.println(s.substring(1,8)); //  //  means this get part of String from i to i-1;
        System.out.println(s.substring(2,2));
        System.out.println(s.substring(2,3));



    }
}
