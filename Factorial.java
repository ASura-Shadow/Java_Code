import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to factorial: ");
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        long factorial=factorial(num);
        System.out.println("Factorial of "+num+" is "+factorial);
    }
    public static long factorial(int num){
        if(num<2) {
            return 1;
        }
        long fact=1;
        int i=2;
        while(i <= num){
            fact*=i;
            i++;
        }
        return fact;
    }



}
