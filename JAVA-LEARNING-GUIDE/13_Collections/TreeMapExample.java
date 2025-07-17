import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Math", 90);
        marks.put("Physics", 85);
        marks.put("Chemistry", 88);

        for (String subject : marks.keySet()) {
            System.out.println(subject + ": " + marks.get(subject));
        }
    }
}
