package algorithms.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {1, 34, 2, 5, 2, 61};
        int[] sortedNumbers = bubbleSort(numbers);
        for (int sortedNumber : sortedNumbers) {
            System.out.println(sortedNumber);
        }
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
