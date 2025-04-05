import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum Digits");
        System.out.print("Enter any number: ");
        int num =sc.nextInt();
        int sum = digitSum(num);
        System.out.println("Sum of digit is "+ sum);
    }
    public static int digitSum(int num){
        int sum=0;
        while (num !=0){
            sum+=num%10;
            num/=10;
        }
        return sum ;
    }
}
