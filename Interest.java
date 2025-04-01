import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate interest :");
        System.out.print("Enter your principle amount : ");
        int p = sc.nextInt();
        System.out.print("Enter your rate of interest :");
        float r =sc.nextFloat();
        System.out.print("Enter how many year are you borrowing this money:  ");
        float t = sc.nextFloat();

        float si=(p*r*t)*100;
        double ci=p*Math.pow((1+r/100),t);
        System.out.println("Your Simple Interest is  "+si);
        System.out.println("Your compound Interest is  "+ci);
    }
}
