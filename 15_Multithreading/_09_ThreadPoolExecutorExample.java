import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _09_ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Running task " + taskId + " in " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
