import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of Circle=" + area);
    }
}
