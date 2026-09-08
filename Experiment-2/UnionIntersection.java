import java.util.ArrayList;
import java.util.List;

public class UnionIntersection {

    public static List<Integer> union(int[] first, int[] second) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < first.length || j < second.length) {
            int value;
            if (j == second.length || (i < first.length && first[i] < second[j])) {
                value = first[i++];
            } else if (i == first.length || second[j] < first[i]) {
                value = second[j++];
            } else {
                value = first[i];
                i++;
                j++;
            }

            if (result.isEmpty() || result.get(result.size() - 1) != value) {
                result.add(value);
            }
        }
        return result;
    }

    public static List<Integer> intersection(int[] first, int[] second) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                i++;
            } else if (second[j] < first[i]) {
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != first[i]) {
                    result.add(first[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 4, 5};
        int[] second = {2, 4, 6};

        System.out.println("Union: " + union(first, second));
        System.out.println("Intersection: " + intersection(first, second));
    }
}
