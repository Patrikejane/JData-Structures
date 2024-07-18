package com.loollab.data_structures.Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sskma
 * @Created 18/07/2024 - 1:16 AM
 * @project data_structures
 */
class InsertionSortTest {

    @Test
    public void testSortWithUnsortedArray() {
        Integer[] unsortedArray = {4, 2, 7, 1, 3};
        Integer[] expectedArray = {1, 2, 3, 4, 7};
        Integer arraySize = unsortedArray.length;

        Integer[] sortedArray = InsertionSort.sort(unsortedArray, arraySize);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortWithAlreadySortedArray() {
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        Integer[] expectedArray = {1, 2, 3, 4, 5};
        Integer arraySize = sortedArray.length;

        Integer[] resultArray = InsertionSort.sort(sortedArray, arraySize);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testSortWithArrayContainingDuplicates() {
        Integer[] unsortedArray = {5, 3, 8, 3, 1};
        Integer[] expectedArray = {1, 3, 3, 5, 8};
        Integer arraySize = unsortedArray.length;

        Integer[] sortedArray = InsertionSort.sort(unsortedArray, arraySize);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortWithArrayContainingNegatives() {
        Integer[] unsortedArray = {0, -2, 4, -1, 3};
        Integer[] expectedArray = {-2, -1, 0, 3, 4};
        Integer arraySize = unsortedArray.length;

        Integer[] sortedArray = InsertionSort.sort(unsortedArray, arraySize);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortWithEmptyArray() {
        Integer[] emptyArray = {};
        Integer[] expectedArray = {};
        Integer arraySize = emptyArray.length;

        Integer[] sortedArray = InsertionSort.sort(emptyArray, arraySize);

        assertArrayEquals(expectedArray, sortedArray);
    }
}