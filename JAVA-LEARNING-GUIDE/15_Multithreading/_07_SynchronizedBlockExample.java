class Printer {
    void printDocument(String doc) {
        synchronized (this) {
            System.out.println("Printing: " + doc);
        }
    }
}

public class _07_SynchronizedBlockExample {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> printer.printDocument("Doc1"));
        Thread t2 = new Thread(() -> printer.printDocument("Doc2"));

        t1.start();
        t2.start();
    }
}
