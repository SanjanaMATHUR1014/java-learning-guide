public class MaxOfTwoNumbers{
    public static void main(String[] args) {
        int a=14,b=16;
        System.out.println("Maximum: "+max(a,b));
    }
    static int max(int x, int y){
        return (x>y)?x:y;
    }
}