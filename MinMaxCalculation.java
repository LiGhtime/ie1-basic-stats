import java.util.Arrays;

// random comment
// comment by anusha
public class MinMaxCalculation {

    public static int[] findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty");
        }

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int[] minMax = findMinMax(numbers);
        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }
}