public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
