public class SumOfNNumbers{
    public static void main(String[] args) {
        int n=100;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+ " numbers is:"+sum);
    }
}