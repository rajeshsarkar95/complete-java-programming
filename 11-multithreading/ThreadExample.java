public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Worker: " + i);
            }
        });

        worker.start();
        worker.join();
        System.out.println("Main finished after worker");
    }
}
