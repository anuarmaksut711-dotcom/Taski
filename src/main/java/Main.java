public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 9, 2, 7};
        int maximum = Task1.findMaximum(numbers, 0, numbers.length - 1);

        System.out.println("Maximum: " + maximum);
        System.out.println("Expected: 9");

        int[] negativeNumbers = {-8, -3, -15, -1, -9, -12};
        int negativeMaximum = Task1.findMaximum(
                negativeNumbers, 0, negativeNumbers.length - 1
        );

        System.out.println("Negative maximum: " + negativeMaximum);
        System.out.println("Expected: -1");

        int[] sortedNumbers = {1, 3, 5, 7, 9, 11, 13};

        int foundIndex = Task2.binarySearch(
                sortedNumbers, 7, 0, sortedNumbers.length - 1
        );

        System.out.println("Index of 7: " + foundIndex);
        System.out.println("Expected: 3");

        int missingIndex = Task2.binarySearch(
                sortedNumbers, 2, 0, sortedNumbers.length - 1
        );

        System.out.println("Index of 2: " + missingIndex);
        System.out.println("Expected: -1");

        int[] singleNumber = {42};

        int singleIndex = Task2.binarySearch(
                singleNumber, 42, 0, singleNumber.length - 1
        );

        System.out.println("Index of 42: " + singleIndex);
        System.out.println("Expected: 0");

        int[] emptyNumbers = {};

        int emptyIndex = Task2.binarySearch(
                emptyNumbers, 5, 0, emptyNumbers.length - 1
        );

        System.out.println("Search in empty array: " + emptyIndex);
        System.out.println("Expected: -1");
    }
}