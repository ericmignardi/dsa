package algorithms.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println("Index: " + binarySearch(array, 9));
    }

    private static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
