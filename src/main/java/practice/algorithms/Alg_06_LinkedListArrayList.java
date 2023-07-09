package practice.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;

public class Alg_06_LinkedListArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i=0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        // LinkedList ========================================
        startTime = System.nanoTime();

        //linkedList.get(999999);
        linkedList.remove(500000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: " + elapsedTime + " ns");

        // ArrayList ========================================
        startTime = System.nanoTime();

        //arrayList.get(999999);
        arrayList.remove(500000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:  " + elapsedTime + " ns");

    }
}
