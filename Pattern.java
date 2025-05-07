import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to pattern.");
        System.out.print("Please enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Printing pattern 1:");
        pattern1(row);
        System.out.println("Printing pattern 2:");
        pattern2(row);
        System.out.println("Printing pattern 3:");
        pattern3(row);
    }

    public static void pattern1(int row)
    {
        int i=1;
        while(i<=row)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern2(int row)
    {
        while(row > 0)
        {
            int j=1;
            while(j<=row)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row--;
        }
    }

    public static void pattern3(int row)
    {
        int a=row;
        while(row > 0)
        {
            int i=0;
            //loop for print space
            while(i<row-1)
            {
                System.out.print("  ");
                i++;
            }
            int j=0;
            while(j<=(a-row))
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row--;
        }
    }
}
