import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to reverse digit calculator.");
        System.out.print("Please enter any number: ");
        int num=sc.nextInt();
        int rev = reverseNo(num);
        System.out.println("Reverse of "+num+" is "+rev);
    }

    public static int reverseNo(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }


}
