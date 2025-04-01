
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Area of Triangle:");
        System.out.println("Enter the base : ");
        double base= sc.nextDouble();
        System.out.println("Enter the height : ");
        double height= sc.nextDouble();
        System.out.println("Area of triangle is "+(0.5*base*height));
    }
}
