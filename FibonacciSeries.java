import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series. ");
        System.out.print("Please enter the number upto which series has to be printed: ");
        int num=sc.nextInt();
        System.out.println("Here the fibonacci series");
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num ){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");
        int first=0,second=1;
        while (first + second <= num){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }
}
