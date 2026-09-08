public class SearchRotatedSortedArray {

    public static int search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            // The left half is sorted.
            if (numbers[left] <= numbers[middle]) {
                if (numbers[left] <= target && target < numbers[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else { // The right half is sorted.
                if (numbers[middle] < target && target <= numbers[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 7, 8, 1, 2, 3, 4};
        System.out.println("Index of 2: " + search(numbers, 2));
    }
}
