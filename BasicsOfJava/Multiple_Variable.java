package BasicsOfJava;

public class Multiplevariables {
    public static void main(String[] args) {
        int x =2,y =3,z=4;

        System.out.println("The value of x is"+x);
        System.out.println("The Value of y is"+y);
        z = 70;
        z=y+x;
        System.out.println("The Value of z is "+z);
        System.out.println(x+y+z);

        System.out.println("Surprise is "+x+y+z);

       /* Computer dumb*/ System.out.println(x+y+""+z);

        System.out.println("Hello "+"Aman "+"Singh");
//        +x or +y or +z convert number + ""or "text" into text
    }
}
