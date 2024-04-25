package Strings;
public class Immutability {
//    String Immutability in java : We cannot chang individual characters in a string, we can but we waste lot of time space

    public static void main(String[] args) {
        String a = "Aman";
//         Anan
//        1st  index change n

        a = a.substring(0,1)+ "n" +a.substring(2); // "Am" +  "n" ,  "Ana" + "n", "Anan"

//         this is very cost-ive method which more strings due to large  time complexities and space
        System.out.println(a);
    }
}
