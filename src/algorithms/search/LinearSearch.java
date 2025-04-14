package algorithms.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println("Index: " + linearSearch(array, 3));
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
