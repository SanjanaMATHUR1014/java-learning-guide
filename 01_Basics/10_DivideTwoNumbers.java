import java.util.Scanner;
public class DivideTwoNumbers{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
         if(b==0){
            System.out.println("not divisible by 0");
         }else{
            float result=(float) a/b;
            System.out.println("result="+result);
         }
    }
}
