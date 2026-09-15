import java.util.Scanner;

public class Task1 {
    public static int findMaximum(int[] numbers, int left, int right) {
        if (left == right) {
            return numbers[left];
        }

        int middle = left + (right - left) / 2;

        int leftMaximum = findMaximum(numbers, left, middle);
        int rightMaximum = findMaximum(numbers, middle + 1, right);

        if (leftMaximum > rightMaximum) {
            return leftMaximum;
        }

        return rightMaximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Array is empty.");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maximum = findMaximum(numbers, 0, n - 1);
        System.out.println(maximum);

        scanner.close();
    }
}
