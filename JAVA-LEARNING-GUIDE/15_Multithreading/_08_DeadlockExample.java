public class _08_DeadlockExample {
    static final Object Lock1 = new Object();
    static final Object Lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1: Locked Lock1");

                try { Thread.sleep(50); } catch (InterruptedException ignored) {}

                synchronized (Lock2) {
                    System.out.println("Thread 1: Locked Lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread 2: Locked Lock2");

                try { Thread.sleep(50); } catch (InterruptedException ignored) {}

                synchronized (Lock1) {
                    System.out.println("Thread 2: Locked Lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
