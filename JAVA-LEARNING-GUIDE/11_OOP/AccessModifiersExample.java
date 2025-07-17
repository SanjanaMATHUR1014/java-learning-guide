class A {
    public int x = 10;
    private int y = 20;
    protected int z = 30;

    public void printValues() {
        System.out.println("x = " + x); // accessible
        System.out.println("y = " + y); // accessible
        System.out.println("z = " + z); // accessible
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.printValues();
        System.out.println("x = " + obj.x);
        // System.out.println("y = " + obj.y); // Not accessible
        System.out.println("z = " + obj.z);   // Accessible in same package
    }
}
