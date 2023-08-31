package Array.Easy.Easy.;

public class Challenge2icoding {
    static int[] values = {0, 1, 32, 2000, 15000, 1};
    static int targetValue = 1;

    public static void main(String[] args) {
        int count = countOccurrences(values, targetValue);
        System.out.println("Number of occurrences: " + count);
    }

    static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (target == value) {
                count++;
            }
        }
        return count;
    }
}
