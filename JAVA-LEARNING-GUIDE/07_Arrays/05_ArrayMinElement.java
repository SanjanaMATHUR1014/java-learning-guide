public class ArrayMinElement{
    public static void main(String[] args) {
        int[] arr={8,9,1,3,6};
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Minimum Element: "+min);
    }
}