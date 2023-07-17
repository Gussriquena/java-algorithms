package practice.algorithms;

import java.util.LinkedList;

public class Alg_04_LinkedList {
    public static void main(String[] args) {
        // LinkedList = stores nodes in 2 parts (data + address)
        //              Nodes are is non-consecutive memory locations
        //              Elements are linked using pointers

        //                  Singly linked list
        //        Node               Node               Node
        //  [data | address] -> [data | address] -> [data | address]

        //                  Doubly linked list
        //             Node                          Node
        //  [address | data | address] <-> [address | data | address]

        // Advantages?
        // 1 - Dynamic Data Structure (allocates needed memory while running)
        // 2 - Insertion and Deletion of Nodes is easy. O(1)
        // 3 - No/Low memory waste

        // Disadvantages?
        // 1 - Greater memory usage (additional pointer)
        // 2 - No random access of elements (no index[i])
        // 3 - Accessing/Searching elements is more time consuming. O(n)

        // Usages
        // 1 - Implements stacks and queues
        // 2 - GPS Navigation
        // 3 - Music Playlist


        LinkedList<String> linkedList = new LinkedList<>();

        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
         */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }
}
