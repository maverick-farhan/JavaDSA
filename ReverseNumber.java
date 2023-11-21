import java.util.Scanner;
import java.lang.Math;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number to be reversed");
        Scanner in = new Scanner(System.in);
        int original = in.nextInt();
        System.out.println("Enter Exponent of the number( How long is the number e.g 23131 = exp:4)");
        Scanner exp= new Scanner(System.in);
        int power = exp.nextInt();
        int reversed = 0;
        int count = 0;
        while(original>0){
            if(count<=power){
            int rem = original%10;
            reversed = reversed + (int) (rem * (Math.pow(10,power-count)));
            original/=10;
            count++;
            }
        }
        System.out.println(reversed);
    }
}
