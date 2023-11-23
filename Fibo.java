import java.util.Scanner;
//Fibo: 1 1 2 3 5 8 13 21
//nth:  1 2 3 4 5 6 7  8
public class Fibo {
    public static void main(String[] args) {
        // Find the nth Fibonacci series number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Nth Fibo Number");
        int n = in.nextInt();
        int lastLast = 0,last = 1;
        int next = 0;
        for(int i = 1;i<n;i++){
            next = last + lastLast;
            lastLast = last;
            last = next;
        }
        System.out.println(last);
    }
}
