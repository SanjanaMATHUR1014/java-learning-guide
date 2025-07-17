abstract class Animal {
    abstract void sound();
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.breathe();
    }
}
