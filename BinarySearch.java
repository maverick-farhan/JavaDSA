import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,14,20,36,80};
        int target;
        System.out.println("Enter element to search: ");
        Scanner in = new Scanner(System.in);
        target = in.nextInt();
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (start<=end) {
            mid = start + (end - start) / 2;
//            if(arr[mid]==target){
//                return mid;
//            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
