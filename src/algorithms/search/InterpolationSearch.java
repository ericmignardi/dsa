package algorithms.search;

public class InterpolationSearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println("Index: " + interpolationSearch(array, 9));
    }

    private static int interpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high && value >= array[low] && value <= array[high]) {
            int position = low + ((value - array[low]) * (high - low)) /
                    (array[high] - array[low]);
            if (array[position] == value) {
                return position;
            } else if (array[position] < value) {
                low = position + 1;
            } else {
                high = position - 1;
            }
        }
        return -1;
    }
}
