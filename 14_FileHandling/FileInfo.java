import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
