public class ReverseNumber{
    public static int reverse(int num,int rev){
        if(num==0) return rev;
        return reverse(num/10,rev*10+num%10);
    }
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Reversed number: "+reverse(number,0));
    }
}