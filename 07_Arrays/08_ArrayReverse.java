public class ArrayReverse{
    public static void main(String[] args) {
        int[] arr={5,10,15,20};
        System.out.println("Reversed Array:");
        for(int i=arr.length-1; i>=0 ;i--){
            System.out.print(arr[i] + " ");
        }
    }
}