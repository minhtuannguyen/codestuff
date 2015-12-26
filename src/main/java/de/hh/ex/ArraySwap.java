package de.hh.ex;

/**
 * Find with the linear complexity
 * whether an array can be sorted only with one swap operation
 */
public class ArraySwap {

    static boolean sortedWithOneSwap(int[] array) {
        //{1, 7, 3, 4, 5, 6, 2, 8} -> {0, 1, 0, 0, 0, 1, 0}
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            sum += (array[i] - array[i - 1]) >= 0 ? 0 : 1;
        }

        return sum == 2;
    }
}
