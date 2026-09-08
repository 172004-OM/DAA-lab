import java.util.Arrays;

public class DutchNationalFlag {

    // Sort an array containing only 0, 1 and 2 in one pass.
    public static void sort012(int[] numbers) {
        int low = 0;
        int middle = 0;
        int high = numbers.length - 1;

        while (middle <= high) {
            if (numbers[middle] == 0) {
                swap(numbers, low, middle);
                low++;
                middle++;
            } else if (numbers[middle] == 1) {
                middle++;
            } else {
                swap(numbers, middle, high);
                high--;
            }
        }
    }

    private static void swap(int[] numbers, int first, int second) {
        int temporary = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temporary;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 2, 1, 0, 0};
        sort012(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
