import java.util.Arrays;

public class Wealthiest {
    //1672. Richest Customer Wealth
    public static void main(String[] args) {
        int[][] arr = {
                {0,0,3},
                {0,0,0},
                {1,0,1}
        };
        System.out.println(RichestCustomerWealth(arr));
    }

    static int RichestCustomerWealth(int[][] arr){
        int wealthiest= Integer.MIN_VALUE;
        int max;
        for(int i = 0;i<arr.length;i++) {
            max = 0;
            for (int j = 0; j < arr[i].length; j++) {
                max += arr[i][j];
            }
            if(max>wealthiest){
                wealthiest = max;
            }
        }
        return wealthiest;
    }
}
