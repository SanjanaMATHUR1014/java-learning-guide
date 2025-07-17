import java.util.Scanner;
public class MultiplyTwoNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        int product=a*b;
        System.out.println("Product is:"+product);
    }
}