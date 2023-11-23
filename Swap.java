import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,12,9,100};
        System.out.println("Enter 2 Index to be swapped from 0 to "+ (arr.length - 1));
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Swapped Array: " + Arrays.toString(swap(arr, i, j)));
    }

    public static int[] swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
        return arr;
    }
}
