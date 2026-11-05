import java.util.Arrays;

public class SearchAlgorithms {
    static int linearSearch(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) return i;
        }
        return -1;
    }

    // The input array must be sorted.
    static int binarySearch(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (values[mid] == target) return mid;
            if (values[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {1, 3, 5, 7, 9};
        System.out.println(linearSearch(values, 7));
        System.out.println(binarySearch(values, 7));
        System.out.println(Arrays.toString(values));
    }
}
