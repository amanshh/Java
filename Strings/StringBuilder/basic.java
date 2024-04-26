package Strings.StringBuilder;

public class basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aman");
        System.out.println(sb.charAt(1));
        StringBuilder sbr = new StringBuilder(10);
        System.out.println(sbr.capacity());
        System.out.println(sbr.length());

        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());
    }
}
