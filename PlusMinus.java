import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int n = arr.length;
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calculate proportions
        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;

        // Print the results with 6 decimal places
        System.out.printf("%.6f\n%.6f\n%.6f\n", positiveRatio, negativeRatio, zeroRatio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array with validation
        int n;
        do {
            System.out.print("Enter the size of the array (0 < n <= 100): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 100);

        // Input array elements with validation
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int element;
            do {
                System.out.printf("Enter element %d (-100 <= arr[%d] <= 100): ", i + 1, i);
                element = scanner.nextInt();
            } while (element < -100 || element > 100);

            arr[i] = element;
        }

        // Call the plusMinus function
        plusMinus(arr);

        // Close the scanner
        scanner.close();
    }
}
