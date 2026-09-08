import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;
        sort(numbers, left, middle);
        sort(numbers, middle + 1, right);
        merge(numbers, left, middle, right);
    }

    private static void merge(int[] numbers, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temporary[k++] = numbers[i++];
            } else {
                temporary[k++] = numbers[j++];
            }
        }

        while (i <= middle) {
            temporary[k++] = numbers[i++];
        }
        while (j <= right) {
            temporary[k++] = numbers[j++];
        }

        for (int index = 0; index < temporary.length; index++) {
            numbers[left + index] = temporary[index];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {9, 3, 7, 1, 6};
        sort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
