import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Calculate Perimeter of rectangle: ");
        System.out.println("Enter all four sides: ");
        double first=sc.nextDouble();
        double second=sc.nextDouble();
        double third=sc.nextDouble();
        double four=sc.nextDouble();
        System.out.println("Perimeter of rectangle is "+ (first+second+third+four));
    }
}
