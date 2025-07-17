import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate, will not be added

        System.out.println("Fruits in insertion order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
