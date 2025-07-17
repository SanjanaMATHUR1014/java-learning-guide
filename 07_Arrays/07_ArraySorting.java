import java.util.Arrays;
public class ArraySorting{
    public static void main(String[] args) {
        int[] arr= {4,1,7,2,9};
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}