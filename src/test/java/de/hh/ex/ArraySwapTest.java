package de.hh.ex;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Find with the linear complexity
 * whether an array can be sorted only with one swap operation
 */
public class ArraySwapTest {

    @Test
    public void positiveCase1() throws Exception {
        //Given
        int[] array = new int[]{1, 7, 3, 4, 5, 6, 2, 8};

        //Then
        boolean canBeSorted = ArraySwap.sortedWithOneSwap(array);

        //Then
        assertTrue(canBeSorted);

    }

    @Test
    public void positiveCase2() throws Exception {
        //Given
        int[] array = new int[]{1, 2, 3, 4, 5, 9, 8, 7};

        //Then
        boolean canBeSorted = ArraySwap.sortedWithOneSwap(array);

        //Then
        assertTrue(canBeSorted);
    }

    @Test
    public void negativeCase1() throws Exception {
        //Given
        int[] array = new int[]{8, 7, 3, 4, 5, 6, 2, 1};

        //Then
        boolean canBeSorted = ArraySwap.sortedWithOneSwap(array);

        //Then
        assertFalse(canBeSorted);
    }

    @Test
    public void negativeCase2() throws Exception {
        //Given
        int[] array = new int[]{1, 2, 3, 4, 5, 9, 8, 7, 0};

        //Then
        boolean canBeSorted = ArraySwap.sortedWithOneSwap(array);

        //Then
        assertFalse(canBeSorted);
    }


    @Test
    public void negativeCase3() throws Exception {
        //Given
        int[] array = new int[]{1, 7, 3, 3, 4, 5, 6, 2, 8, 10, 10, 11, 1};

        //Then
        boolean canBeSorted = ArraySwap.sortedWithOneSwap(array);

        //Then
        assertFalse(canBeSorted);
    }

}