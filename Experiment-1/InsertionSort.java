import java.util.Arrays;

public class InsertionSort {

    // Iterative insertion sort: one element is placed at a time.
    public static void insertionSortIterative(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;
        }
    }

    // Recursive insertion sort: sort the first n - 1 elements, then insert the last one.
    public static void insertionSortRecursive(int[] numbers, int n) {
        if (n <= 1) {
            return;
        }

        insertionSortRecursive(numbers, n - 1);
        int current = numbers[n - 1];
        int j = n - 2;

        while (j >= 0 && numbers[j] > current) {
            numbers[j + 1] = numbers[j];
            j--;
        }
        numbers[j + 1] = current;
    }

    public static void main(String[] args) {
        int[] iterativeArray = {8, 4, 2, 9, 5};
        int[] recursiveArray = {8, 4, 2, 9, 5};

        insertionSortIterative(iterativeArray);
        insertionSortRecursive(recursiveArray, recursiveArray.length);

        System.out.println("Iterative: " + Arrays.toString(iterativeArray));
        System.out.println("Recursive: " + Arrays.toString(recursiveArray));
    }
}
