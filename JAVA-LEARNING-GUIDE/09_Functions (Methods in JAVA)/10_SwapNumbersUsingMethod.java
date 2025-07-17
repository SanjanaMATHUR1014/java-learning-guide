public class SwapNumbersUsingMethod{
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swap: a= "+a+ ", b= "+b);
        swap(a, b);
    }
    static void swap(int x,int y){
        int temp =x;
        x=y;
        y=temp;
        System.out.println("Inside method: a = "+x+ ", b = "+y);
    }
}