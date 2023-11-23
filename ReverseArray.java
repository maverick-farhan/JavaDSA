import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,2,4,14,5,10};
        System.out.println("Before Array reverse: " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println("After Array reverse: "+ Arrays.toString(arr));
    }

    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
