import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences.");
        System.out.print("Enter the size of array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the element in array: ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Now enter the number you want to find: ");
        int num = sc.nextInt();

        int occ = noOfOccurrences(arr,num);
        System.out.println("Your element was found "+ occ + " times in the array.");
    }

    public static int noOfOccurrences(int[] arr, int num)
    {
        int count = 0;
        int i=0;
        while(i< arr.length)
        {
            if(arr[i] == num)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
