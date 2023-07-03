package practice.algorithms;

import practice.algorithms.util.DynamicArray;

public class Alg_05_DynamicArrays {
    public static void main(String[] args) {

        //  Dynamic Arrays = a class that uses a static array to work dynamically with collecions

        // Advantages:
        // 1 - Random access to elements O(1)
        // 2 - Good locality of reference and data cache utilization
        // 3 - Easy to insert/delete at the end

        // Disavantages
        // 1 - Wastes more memory
        // 2 - Shifting elements is time consuming O(n)
        // 3 - Expanding/Shrinking the array is time consuming O(n)

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        //dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.search("D"));
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("is empty: " + dynamicArray.isEmpty());

    }
}
