public class ArraySum{
    public static void main(String[] args) {
        int[] arr={5,10,15,20,25};
        int sum=0;
        System.out.println("Array sum:");
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
        
    }
}