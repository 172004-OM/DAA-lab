public class MajorityElement {

    // Moore's Voting Algorithm finds a possible majority candidate.
    public static Integer findMajority(int[] numbers) {
        int candidate = 0;
        int votes = 0;

        for (int number : numbers) {
            if (votes == 0) {
                candidate = number;
            }
            votes += (number == candidate) ? 1 : -1;
        }

        int count = 0;
        for (int number : numbers) {
            if (number == candidate) {
                count++;
            }
        }

        return count > numbers.length / 2 ? candidate : null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 2, 3, 2, 2};
        Integer majority = findMajority(numbers);

        if (majority == null) {
            System.out.println("No majority element");
        } else {
            System.out.println("Majority element: " + majority);
        }
    }
}
