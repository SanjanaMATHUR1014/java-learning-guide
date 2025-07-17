import java.util.LinkedList;

public class _10_ProducerConsumerProblem {
    public static void main(String[] args) {
        LinkedList<Integer> buffer = new LinkedList<>();
        int capacity = 5;

        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == capacity) {
                        try { buffer.wait(); } catch (InterruptedException ignored) {}
                    }
                    buffer.add(value);
                    System.out.println("Produced: " + value++);
                    buffer.notify();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try { buffer.wait(); } catch (InterruptedException ignored) {}
                    }
                    int val = buffer.removeFirst();
                    System.out.println("Consumed: " + val);
                    buffer.notify();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
