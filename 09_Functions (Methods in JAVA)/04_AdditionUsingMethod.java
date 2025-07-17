public class AdditionUsingMethod {
    public static void main(String[] args) {
        int a=7, b = 9;
        int sum= add(a, b);
        System.out.println("Sum: "+sum);
    }
    static int add(int x,int y){
        return x+y;
    }
}
   