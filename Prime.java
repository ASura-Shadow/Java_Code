import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to prime no. checker: ");
        System.out.print("Please enter any number: ");
        int num=sc.nextInt();
        if(prime(num)==2){
            System.out.println(num+" is prime number.");
        }
        else {
            System.out.println(num+" is not prime number.");
        }

    }
    public static int prime(int num){
        int count=0;
        int i=1;
        while(i*i<num){
            if(num % i ==0){
                if(i==num/i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
            i++;
        }
        return count;
    }
}
