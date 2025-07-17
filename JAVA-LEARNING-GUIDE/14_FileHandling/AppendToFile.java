import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt", true);
            writer.write("\nThis text is appended.");
            writer.close();
            System.out.println("Append successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
