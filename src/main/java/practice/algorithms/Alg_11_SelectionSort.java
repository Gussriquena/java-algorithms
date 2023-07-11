package practice.algorithms;

public class Alg_11_SelectionSort {
    public static void main(String[] args) {

        // Selection sort = search through an array and keep track of the minimum value during
        //                  each iteration. At the end of each iteration, we swap variables

        // Quadratic time O(n^2)
        // small data set = Okay
        // large data set = BAD

        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 8};

        selectionSort(array);

        for (int i : array){
            System.out.println(i);
        }

    }

    private static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
