public class FactorialOfNumber{
    public static void main(String[] args) {
        int n=9;
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+ " is:"+fact);
    }
}