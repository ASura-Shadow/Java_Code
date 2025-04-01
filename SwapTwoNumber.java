import java.util.Scanner;
public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int temp;
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Number before swapping: ");
        System.out.println("First number is:"+num1+"\nSecond number is "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Number after swapping: ");
        System.out.println("First number is:"+num1+"\nSecond number is "+num2);

    }
}
