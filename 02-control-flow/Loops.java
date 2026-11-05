public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("for: " + i);
        }

        int count = 3;
        while (count > 0) {
            System.out.println("while: " + count);
            count--;
        }

        int value = 1;
        do {
            System.out.println("do-while: " + value);
            value++;
        } while (value <= 2);
    }
}
