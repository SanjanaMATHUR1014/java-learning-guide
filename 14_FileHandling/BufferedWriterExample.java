import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"))) {
            writer.write("BufferedWriter writing line by line.");
            System.out.println("Write complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
