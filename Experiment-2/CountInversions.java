public class CountInversions {

    public static long count(int[] numbers) {
        return mergeSortAndCount(numbers, 0, numbers.length - 1);
    }

    private static long mergeSortAndCount(int[] numbers, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int middle = left + (right - left) / 2;
        long inversions = mergeSortAndCount(numbers, left, middle);
        inversions += mergeSortAndCount(numbers, middle + 1, right);
        inversions += mergeAndCount(numbers, left, middle, right);
        return inversions;
    }

    private static long mergeAndCount(int[] numbers, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;
        long inversions = 0;

        while (i <= middle && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temporary[k++] = numbers[i++];
            } else {
                temporary[k++] = numbers[j++];
                inversions += middle - i + 1;
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
        return inversions;
    }

    public static void main(String[] args) {
        int[] numbers = {8, 4, 2, 1};
        System.out.println("Number of inversions: " + count(numbers));
    }
}
