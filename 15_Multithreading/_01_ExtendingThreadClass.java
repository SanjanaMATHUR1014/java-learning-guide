public class _01_ExtendingThreadClass extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class.");
    }

    public static void main(String[] args) {
        _01_ExtendingThreadClass t = new _01_ExtendingThreadClass();
        t.start();
    }
}
