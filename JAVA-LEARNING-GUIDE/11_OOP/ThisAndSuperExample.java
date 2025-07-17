class Parent {
    String msg = "Parent class";
}

class Child extends Parent {
    String msg = "Child class";

    void printMessages() {
        System.out.println(this.msg);        // Refers to current class
        System.out.println(super.msg);       // Refers to parent class
    }
}

public class ThisAndSuperExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.printMessages();
    }
}
