package practice.algorithms;

public class Alg_12_InsertionSort {

    public static void main(String[] args) {
        // Insertion sort = after comparing elements to the left
        //                  shift  elements to the right to make room to insert a value

        // Quadratic time O(n^2)
        // small data set = decent
        // large data set = BAD

        // Less steps than Bubble sort
        // Best case is O(n) compared to Selection Sort O(n^2)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 8};

        insertionSort(array);

        for (int i : array){
            System.out.print(i + " ");
        }

    }

    private static void insertionSort(int[] array){
        // Final solution
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }

    private static void insertionSortMy(int[] array) {
        // my solution
        for(int i = 1; i < array.length; i++){
            for(int j = 1; j < array.length; j++) {
                int currentValue = array[j];

                if (currentValue < array[j - 1]) {
                    array[j] = array[j - 1];
                    array[j - 1] = currentValue;
                }
            }
        }
    }

}
