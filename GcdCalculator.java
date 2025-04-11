import java.util.Scanner;

public class GcdCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Gcd Calculator");
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second=sc.nextInt();
        int gcd = gcd(first,second);
        System.out.println("GCD of "+first+" and "+second+" is "+gcd);

    }
    public static  int least (int num1,int num2){
        if(num1<num2){
            return num1;
        }
        else
            return num2;
    }

    public static int gcd(int num1,int num2){
        int gcd = 1;
        int least=least(num1,num2);//Math.min(num1,num2)
        while (least!=0){
            if(num1 % least == 0 && num2 % least == 0){
                gcd=least;
                break;
            }
            least--;
        }
        return gcd;
    }
}
