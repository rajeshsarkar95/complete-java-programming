import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<Integer> result = executor.submit(() -> 20 + 22);
            System.out.println(result.get());
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException exception) {
            throw new RuntimeException(exception.getCause());
        } finally {
            executor.shutdown();
        }
    }
}
