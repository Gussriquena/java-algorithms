package practice.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Alg_02_Queues {
    public static void main(String[] args) {
        // Queue = FIFO data structure.  First-in First-out (ex. a line of people)
        //         A collection designed for holding elements prior to processing
        //         Linear data structure

        //         add    = enqueue, offer()
        //         remove = dequeue, poll()

        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);

        // Where are queues useful?
        // 1 - Keyboard buffer (letters should appear on the screen in the order they're pressed)
        // 2 - Printer Queue (Print jobs should be completed in order)
        // 3 - Used in linkedLists, PriorityQueues, Breadth-first search
    }
}
