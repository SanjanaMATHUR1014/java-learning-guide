public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int data = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
