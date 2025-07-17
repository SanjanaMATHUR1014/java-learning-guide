public class _02_ImplementingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface.");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new _02_ImplementingRunnable());
        t.start();
    }
}
