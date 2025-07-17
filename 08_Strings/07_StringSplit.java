public class StringSplit {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
