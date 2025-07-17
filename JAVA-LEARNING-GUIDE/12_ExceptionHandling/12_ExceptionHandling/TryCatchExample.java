public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
