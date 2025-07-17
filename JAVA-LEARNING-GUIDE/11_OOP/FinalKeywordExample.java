final class FinalClass {
    void show() {
        System.out.println("Final class cannot be extended.");
    }
}

class Demo {
    final int num = 100;

    void display() {
        System.out.println("Value: " + num);
        // num = 200; // This will cause a compile-time error
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.show();

        Demo d = new Demo();
        d.display();
    }
}
