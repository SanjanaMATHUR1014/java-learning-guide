public class PalindromeCheckMethod{
    public static void main(String[] args) {
        int number=121;
        if(isPalindrome(number))
        System.out.println(number+" is Palindrome.");
        else
        System.out.println(number+" not a Palindrome");
    }
    static boolean isPalindrome(int n){
        int rev=0,temp=n;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev==temp;
    }
}