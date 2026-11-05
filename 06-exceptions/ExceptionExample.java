public class ExceptionExample {
    static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisor cannot be zero");
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (IllegalArgumentException exception) {
            System.out.println("Input error: " + exception.getMessage());
        } finally {
            System.out.println("Finished");
        }
    }
}
