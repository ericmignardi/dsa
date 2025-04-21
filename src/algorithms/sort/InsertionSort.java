package algorithms.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {1, 34, 2, 5, 2, 61};
        int[] sortedNumbers = insertionSort(numbers);
        for (int sortedNumber : sortedNumbers) {
            System.out.println(sortedNumber);
        }
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            // Shift elements to the right to make space for the current element
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }
}
