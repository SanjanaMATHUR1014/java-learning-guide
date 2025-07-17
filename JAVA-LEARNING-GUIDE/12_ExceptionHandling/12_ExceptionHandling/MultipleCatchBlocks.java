public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // ArrayIndexOutOfBounds
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
