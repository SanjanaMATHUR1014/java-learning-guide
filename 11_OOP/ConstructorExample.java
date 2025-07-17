class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Person p = new Person("John");
        p.display();
    }
}
