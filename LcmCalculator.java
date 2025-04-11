import java.util.Scanner;

public class LcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Lcm Calculator");
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        int lcm = lcm(first, second);
        System.out.println("Lcm of "+first+" & "+second+" is "+lcm);
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {//while(i<=second)
            if ((first * i) % second == 0 ) {
                return (first * i);
            }
            i++;
        }
    }
}