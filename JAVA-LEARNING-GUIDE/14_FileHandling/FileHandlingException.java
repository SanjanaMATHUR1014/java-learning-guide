import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingException {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: File not found.");
        }
    }
}
