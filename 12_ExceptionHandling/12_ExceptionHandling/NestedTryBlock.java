public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception handled");
            }

            try {
                int[] arr = new int[5];
                arr[10] = 50;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Exception handled");
            }

        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
