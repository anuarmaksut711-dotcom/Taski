import java.util.Scanner;

public class Task2 {
    public static int binarySearch(int[] numbers, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (numbers[middle] == target) {
            return middle;
        }

        if (target < numbers[middle]) {
            return binarySearch(numbers, target, left, middle - 1);
        }

        return binarySearch(numbers, target, middle + 1, right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        int index = binarySearch(numbers, target, 0, n - 1);
        System.out.println(index);

        scanner.close();
    }
}