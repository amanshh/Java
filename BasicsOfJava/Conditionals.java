package Bacis_of_Java;

public class Conditional_statements {
    public static void main(String[] args) {
   /*int age =12;
     if ( age>=18 && age<60)
     {
     System.out.println(" You are  Legal Adult");
     }
     else if (age >= 60)
     {
        System.out.println("You are a Senior Citizen");
     }
if ( age<18)
      System.out.println("You are still a kid ");
     }

    }
*/
        int age = 17;
        if ( age>=18 && age <60)
        {
            if( age>20 && age<30)
            {
                System.out.println("You are in 20's");
            }
            else if ( age >30 && age <40)
            {
                System.out.println("You are in 30's");
            }
            else if ( age >40 && age <50)
                System.out.println("You are in 40's ");
            else if ( age>50 && age<60)
            {
                System.out.println("You are in 50's");
            }
            else
            {
                System.out.println("You are still teen ager");
            }
        }
        else if (age>=60)
        {
            System.out.println("You are an old man");
        }
        else if (age<16)
        {
            System.out.println("You are a kid");
        }
        else
        {
            System.out.println("You are Legal Adult"  );
        }
    }

}