public class ThrowsKeywordExample {
    public static void main(String[] args) throws InterruptedException {
        doWork();
    }

    static void doWork() throws InterruptedException {
        Thread.sleep(1000); // throws InterruptedException
        System.out.println("Work done");
    }
}
