package practice.algorithms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Alg_03_PriorityQueue {
    public static void main(String[] args) {
        // Priority Queue = FIFO data structure that serves elements
        //                  with the highest priorities first
        //                  beore elements with lower priority

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
