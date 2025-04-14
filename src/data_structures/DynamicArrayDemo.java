package data_structures;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
//        dynamicArray.insert(0, "X");
//        dynamicArray.delete("A");
//        System.out.println("Index: " + dynamicArray.search("C"));
        System.out.println("isEmpty: " + dynamicArray.isEmpty());
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println(dynamicArray);
    }
}
