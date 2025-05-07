import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array sum and average");
        System.out.print("Enter the size of array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the element in array: ");
        for(int i = 0 ; i < l ; i++)
        {
           arr[i] = sc.nextInt();
        }

        System.out.println("Sum of all element in array is " + sum(arr));
        System.out.println("Average of element in array is " + average(arr));
    }
    public static long sum(int[] array)
    {
        long sum=0;
        int i=0;
        while(i<array.length)
        {
            sum += array[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] array)
    {
        int i=0;
        int l = array.length;
        long sum = sum(array);
        return (int)(sum/l);

    }
}
