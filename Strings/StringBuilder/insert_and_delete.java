package DSA_Strings.StringBuilder;

public class insert_and_delete {
    public static void main(String[] args) {
//        deleteCharAt() --> we give index, that particular character is removed from the String
//        inserts() --> inserts a char, int , String at a particuler index and shift the rest of elements.
        StringBuilder sb =new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(sb);
        sb.deleteCharAt(2); // individual delete
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        sb.delete(2,9); // delete characters from 2 to 8 // Range of deletes
        System.out.println(sb);

        sb.insert(2,'c');
        System.out.println(sb);
        sb.insert(3, 007);
        System.out.println(sb);
        sb.insert(0,"AMAN ");
        System.out.println(sb);
sb.reverse();
        System.out.println(sb);
    }
}
