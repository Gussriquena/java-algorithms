package practice.algorithms;

import java.util.Stack;

public class Alg_01_Stacks {

    public static void main(String[] args) {

        // Stack = LIFO data structure, Last-in, First-out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top
        //         peek() to retrieve without remove from the top

        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("GTA V");

        // Uses of stacks:
        // 1 - Undo/redo features in text editors
        // 2 - Moving back/forward through browser history
        // 3 - Backtracking algorithms (maze, file directories)
        // 4 - Calling functions (call stack)
    }

}
