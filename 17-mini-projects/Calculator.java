import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("First number: ");
            double a = scanner.nextDouble();
            System.out.print("Operator (+, -, *, /): ");
            String operator = scanner.next();
            System.out.print("Second number: ");
            double b = scanner.nextDouble();

            double result;
            switch (operator) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> {
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    result = a / b;
                }
                default -> {
                    System.out.println("Unsupported operator.");
                    return;
                }
            }
            System.out.println("Result: " + result);
        }
    }
}
