public class _04_ThreadJoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread 1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread 2");
            }
        });

        t1.start();
        try {
            t1.join(); // wait for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
