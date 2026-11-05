import java.util.Arrays;

public class SortingAlgorithms {
    static void bubbleSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 4, 2, 8};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }
}
