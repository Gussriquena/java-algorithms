package practice.algorithms;

public class Alg_13_Recursion {
    public static void main(String[] args) {
        // Recursion = When a thing is defined in terms of itself.
        //             Apply the result of a procedure, to a procedure.
        //             A recursive method calls itself. Can be a substitute for interation.
        //             Divide a problem into sub-problems of the same type as the original.
        //             Commonly used with advanced sorting algorithms and navigating trees.

        //             Advantages
        //             1 - Easier to read/write
        //             2 - Easier to debug

        //             Disadvantages
        //              1 - Sometimes slower
        //              2 - Uses more memory

        walk(5);
    }

    private static void walk(int steps) {
        if(steps < 1) return;

        System.out.println("You take a step!");

        walk(steps-1);
    }
}
