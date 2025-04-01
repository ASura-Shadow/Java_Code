import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Converting Temperature:");
        System.out.print("Enter the temperature in fahrenheit: ");
        float f=sc.nextFloat();
        float c = (f-32)*5/9;
        System.out.println("Temperature in Celsius is "+c);
    }
}
