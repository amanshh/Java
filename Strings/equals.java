package Strings;
public class equals {
    public static void main(String[] args) {
        String p = "Aman";
        String q = "Aman";
//        String r = "abc";
//        r += "xyz";
        String n = new String(q);
//        ==
//        System.out.println(p==q);      //  true due to same points place
                System.out.println(p==n); //false  due to different points place
//        equals
        System.out.println(p.equals(n)); // true due uses equals
    }
}


