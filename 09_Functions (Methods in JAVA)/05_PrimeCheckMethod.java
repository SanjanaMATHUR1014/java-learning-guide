public class PrimeCheckMethod{
    public static void main(String[] args) {
        int num=29;
        if(isPrime(num))
        System.out.println(num+" is Prime");
        else
        System.out.println(num+ " is not Prime");
    }
    static boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}