public class ArrayMaxElement{
    public static void main(String[] args) {
        int[] arr= {14,22,3,45,18};
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Maximum Element: "+max);
    }
}