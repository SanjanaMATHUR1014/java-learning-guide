public class MethodWithReturnValue{
    public static void main(String[] args) {
        int result=multiply(14,16);
        System.out.println("Multiplication: "+result);
    }
    static int multiply(int x,int y){
        return x*y;
    }
}