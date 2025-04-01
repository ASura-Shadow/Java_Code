import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showing Bitwise Operator: ");
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.println("AND:-");
        System.out.println("Result is "+(first & second));
        System.out.println("OR:-");
        System.out.println("Result is "+(first | second));
        System.out.println("XOR:-");
        System.out.println("Result is "+(first ^ second));
        System.out.println("NOT:-");
        System.out.println("Result for first number is "+~first);
        System.out.println("Result for second number is "+~second);
        System.out.println("Left shift with 1 digit:-");
        System.out.println("Result for first number is "+ (first << 1));
        System.out.println("Result for second number is "+ (second << 1));
        System.out.println("Right shift with 1 digit:-");
        System.out.println("Result for first number is "+ (first >> 1));
        System.out.println("Result for second number is "+ (second >> 1));
    }
}
