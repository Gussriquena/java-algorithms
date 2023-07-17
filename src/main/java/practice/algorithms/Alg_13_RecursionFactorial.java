package practice.algorithms;

public class Alg_13_RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    private static int factorial(int num) {
        if(num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive case
    }

}
