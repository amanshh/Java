package DSA_Strings.StringBuilder;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abc");
        System.out.println(sb);
        sb.append(30);
        System.out.println(sb);
        sb.append("Aman");
        System.out.println(sb);
        sb.append('*');
        System.out.println(sb);
        char[] ch = {'a','m','n'};
        sb.append(ch);
        System.out.println(sb);
//        int [] arr = {1,2,3,4};
//        sb.append(arr); // does not work, address is appended
//        System.out.println(sb);

        StringBuilder t = new StringBuilder("xyz");
        sb.append(t);
        System.out.println(sb);
    }
}
