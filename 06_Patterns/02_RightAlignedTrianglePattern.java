public class RightAlignedTrianglePattern {
    public static void main(String[] args) {
        int n = 5;  // number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}
