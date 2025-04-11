import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker.");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();
        if (num== reverse(num)){
            System.out.println(num+" is palindrome.");
        }
        else {
            System.out.println(num+" is not palindrome.");
        }
    }

    public static int reverse(int num){

        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;

    }
}
