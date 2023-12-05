import java.util.Scanner;

public class AreaCircle {

    public static void main (String[] args) {

          Scanner sc = new Scanner(System.in);
          double radius ;
          System.out.println("Enter the radius of circle ");
          radius=sc.nextDouble();
          System.out.println(" Area of circle : " + Math.PI * Math.pow(radius,2));
          System.out.println(" Circumference of circle : " + 2 * Math.PI * radius);

    }
}