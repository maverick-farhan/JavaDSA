import java.util.Scanner;

public class Occur {
    // n = 1385798787127127
    //how many times 7 occur in the number
    //Ans: 5
    public static void main(String[] args) {
        System.out.println("Enter the number to be tested: ");
        Scanner inNum = new Scanner(System.in);
        int n = inNum.nextInt();
        int temp = n;
        System.out.println("Enter a number to check occurrences: ");
        Scanner inCheck = new Scanner(System.in);
        int check = inCheck.nextInt();
        int count = 0;
        while(n>0){
        int rem = n%10;
        n/=10;
        if(rem==check){
            count+=1;
        }
        }
        System.out.println("Occurrences of "+ check+" are " + count + " in your number " + temp);
    }
}
