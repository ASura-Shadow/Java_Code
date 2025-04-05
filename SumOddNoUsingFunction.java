import java.util.Scanner;

public class SumOddNoUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of all odd no. from 1 to n:");
        System.out.print("Enter a range : ");
        int num=sc.nextInt();
        sumOddNo(num);
    }
    public static void sumOddNo(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("Sum of all odd no from 1 to "+n+" is "+sum);
    }
}
