import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing Table:");
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        table(num);
    }
    public static void table(int num){
        int i = 1;
        while(i<=10)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
            i++;
        }
    }
}
