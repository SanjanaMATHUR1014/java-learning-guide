public class PrintArrayRecursively {
    public static void printArray(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        printArray(array, 0);
    }
}
