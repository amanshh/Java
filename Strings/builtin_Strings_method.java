package Strings;
public class builtin_String_method {
    public static void main(String[] args) {
        String sc = "Aman Singh";
        System.out.print(sc );
        System.out.println();
        System.out.print(sc.charAt(6));
        System.out.println();
        System.out.println(sc.length());
    }
}

public class builtin_string_2 { // indexOf  compareTo() contains() startsWith()
    public static void main(String[] args) {
        String sc = "Aman Singh";
//        System.out.println(sc.indexOf('a'));
//        System.out.println(sc.indexOf('z'));
//        System.out.println(sc.lastIndexOf('a'));

//    compareTo() --> is used to compare 2 given strings lexographically (dictionary) style
//        System.out.println("compareTo");
//        String a = "abcde";
//        String b = "ABCDE";
//        System.out.println(a.compareTo(b)); // give difference between ascii value

        System.out.println("contains");

        String c = "Kubernetes or K8's Conference";
        System.out.println(c.contains("ference")); // ference is substring

        System.out.println("startsWith");
        System.out.println(c.startsWith("Kube"));
        System.out.println(c.startsWith("Con"));

        System.out.println("endsWith");
        System.out.println(c.endsWith("etes"));
        System.out.println(c.endsWith("ce"));


    }

}
public class builtin_String_3 {
    public static void main(String[] args) {
        String sc = "Aman Singh is 2'nd Year Cadet in NCC ";
        sc.toUpperCase(); // nothing will happen
        sc = sc.toUpperCase(); // will happen
        System.out.println(sc);
//        System.out.println(sc.toUpperCase());
        System.out.println(sc.toLowerCase());


        String z = "Jai Hind EveryOne";
         //sc = sc.concat(z);
       // System.out.println(sc);
// OR
        System.out.println(sc.concat(z));

    }
}