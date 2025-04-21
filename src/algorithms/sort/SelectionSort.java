package algorithms.sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {1, 34, 2, 5, 2, 61};
        int[] sortedNumbers = selectionSort(numbers);
        for (int sortedNumber : sortedNumbers) {
            System.out.println(sortedNumber);
        }
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Assume the min is the first element
            int minIndex = i;
            // Test against elements after i to find the smallest
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum with the first unsorted element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
