package BasicOfJava;

public class Ternary_statement_conditional {
    public static void main(String[] args) {
        int a=10;
        int b= 15;
        int c =20;
        int res = (a<b)?a:b;
        System.out.println(res);
        String result =(a<b)? "a is less" : "b is less";
        System.out.println(result);
        int num= (a<b)? (a<c? a:b) : (b<c? b:c);
        System.out.println(num);

        if(a<b)
        {
            if(a<c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }

            {
                System.out.println(c);
            }
        }
    }

}

