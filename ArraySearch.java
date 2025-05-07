import java.util.Scanner;

public class ArraySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Please enter 10 element in array:");
        for(int i=0 ; i < 10 ; i++)
        {
            arr[i] = sc.nextInt();
        }
        if(arraysearch(arr)){
            System.out.println("Your element was found in array.");
        }
        else{
            System.out.println("Your element was not found in array.");
        }

    }
    public static boolean arraysearch(int []arr){
        int index=0;
        System.out.print("Please enter search element : ");
        int num = sc.nextInt();
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}


