import java.util.Arrays;

// Leetcode: 1295. Find Numbers with Even Number of Digits
public class FindEvenNumbers {
public static void main(String[] args) {
    int[] arr = {1,200,20,100,12,345,2,6,7896};
    System.out.println("Even digit numbers are : " + countEvenDigits(arr));
}
    static int countEvenDigits(int[] arr){
    int count = 0;
    int evenDigits = 0;
    for(int i = 0;i<arr.length;i++)
    {
        while(arr[i]>0) {
            arr[i]/=10;
            count+=1;
        }
        if (count % 2 == 0) {
            evenDigits += 1;
        }
        count=0;
    }
        return evenDigits;
}

}
