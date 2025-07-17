public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }
}
