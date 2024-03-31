package Conditionals;

import java.util.Scanner;

public class problemQ1 {
    public static void main(String[] args) {
        System.out.print("Enter the cost price : ");
        Scanner sc =new Scanner(System.in);
        int cp = sc.nextInt();
        System.out.print("Enter the Selling Price : ");
        int sp = sc.nextInt();
        int Loss = (cp - sp);
        int profit = sp - cp;
        if (sp > cp ) System.out.println(" You profit is : "+ profit);
        else System.out.println("Your Loss is : "+ Loss);
        if(cp == sp) System.out.println("No Profit No Loss");
    }
}

//  GIVEN LENGTH AND BREADTH OF RECTANGLE, WAP WHETHER THE AREA OF RECTANGLE IS GREATER ITS PERIMETER.
