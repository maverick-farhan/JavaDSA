import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[4];
        for(int i = 0;i<array.length;i++){
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
