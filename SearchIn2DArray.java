import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21,3,1},
                {18,7,19,10},
                {100,10},
        };
        System.out.println("Enter target element to search in the array: ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(searchArray(arr,target)));
    }
    static int[] searchArray(int[][]arr,int target){
    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            if(target==arr[i][j]){
                return new int[]{i, j};
            }
        }
    }
        return new int[]{-1,-1};
    }
}
