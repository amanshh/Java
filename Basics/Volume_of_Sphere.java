package Basics;

public class Volume_of_Sphere {
    public static void main(String[] args) {
        // Volume of Sphere is 4/3 pi r ka cube
      float pi = 3.14f;
         float r = 5.6f;
       double x = (4 * 3.14 * r * r * r) / 3;
        System.out.println( "Volume of Sphere with radius "+r +" is : " + x);
    }
}
