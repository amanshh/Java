
package DS_and_Algo.Arrays_ArraysLists;

public class Questions {
////    Question 1 -> given An array of marks of students, if the mark of any student is less than 35 print
////    its roll number. [roll number here refers to the index of array.
//public static void main(String[] args) {
//    int marks [] = {59,39,45,20,90,52,21,30,49,30};
//    int n = marks.length;
//    for (int i = 0; i < n; i++) {
//        if(marks[i] < 35) System.out.print(i + " ");
//    }
//}
//}

// question:  wrong syntax of array in java but right in c,c++
// int size = 10,b[size];

//question3: num[4] --> 5th element from the start, 4th is index, num ia name of array

// questions : swapping

    public static void main(String[] args) {
int [] num = new int[26];
num[0] = 100;
num[25] = 200;
int temp = num[25];
num[25] = num[0];
num[0] = temp;
        System.out.println("\n" + num[0] + " "+ num[25]);
    }
}