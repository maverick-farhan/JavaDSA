public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-700,3,14,28};
        System.out.println(minNumber(arr));
    }
    static int minNumber(int[] arr){
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }return min;
    }
}
