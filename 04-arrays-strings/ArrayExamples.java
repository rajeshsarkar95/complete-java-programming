import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5};
        int sum = 0;
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number > max) max = number;
        }

        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
    }
}
