import java.util.Scanner;

public class EvenOddUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking Even and Odd using Bitwise Operator:");
        System.out.print("Enter any a number: ");
        int num = sc.nextInt();
        if ((num & 1) ==0){
            System.out.println(num+" is even number.");
        }
        else {
            System.out.println(num+" is odd number.");
        }

        if((num | 1) > num){
            System.out.println(num+" is even number.");
        }
        else {
            System.out.println(num+" is odd number");
        }

        if((num ^ 1) == num+1){
            System.out.println(num+" is even number.");
        }
        else{
            System.out.println(num+" is odd number.");
        }
    }
}
