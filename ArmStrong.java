import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to armstrong number checker. ");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        if(num == armStrong(num))
        {
            System.out.println(num+" is armstrong number.");
        }
        else
        {
            System.out.println(num+" is not armstrong number.");
        }
    }

    public static int armStrong(int num)
    {
        int b,sum=0;
      /*
      while(num != 0)
       {
               d++;
           num = num/10;
       }
*/
        int d=noOfDigit(num);
        while (num!=0)
        {
            b=num%10;
            sum = sum + power(b,d);
            num=num/10;
        }
        return sum;
    }
    //function definition to count digit
    public static int noOfDigit(int num)
    {
        int d=0;
        while(num!=0)
        {
            d++;
            num/=10;
        }
        return d;
    }
    //function definition to find power of number
    public static int power(int r,int d)
    {
        int i=1,pow=1;
        while(i<=d)
        {
            pow *= r;
            i++;
        }
        return pow;
    }
}
