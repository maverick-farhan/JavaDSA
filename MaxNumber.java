public class MaxNumber {
    public static void main(String[] args) {
    //max number
        int[] arr = {1,32,2,98,100,10991};
        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
