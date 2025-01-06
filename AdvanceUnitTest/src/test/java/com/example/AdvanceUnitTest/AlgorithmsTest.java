package com.example.AdvanceUnitTest;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void testQuickSort() {
        // Test with empty array
        int[] emptyArr = {};
        Algorithms.quickSort(emptyArr, 0, 0);
        assertArrayEquals(new int[]{}, emptyArr);

        // Test with single element
        int[] singleElement = {5};
        Algorithms.quickSort(singleElement, 0, 0);
        assertArrayEquals(new int[]{5}, singleElement);

        // Test with large array
        int[] largeArr = {9, -1, 4, 2, 8, 6, 7};
        int[] expected = {-1, 2, 4, 6, 7, 8, 9};
        Algorithms.quickSort(largeArr, 0, largeArr.length - 1);
        assertArrayEquals(expected, largeArr);
    }

    @Test
    void testBinarySearch() {
        // Test with negative values
        int[] arr = {-10, -5, 0, 5, 10};
        assertEquals(3, Algorithms.binarySearch(arr, 5));
        assertEquals(-1, Algorithms.binarySearch(arr, 15));

        // Test with empty array
        assertEquals(-1, Algorithms.binarySearch(new int[]{}, 1));
    }

    @Test
    void testReverseString() {
        // Test with special characters
        assertEquals("!@#$", Algorithms.reverseString("$#@!"));

        // Test with null input
        assertThrows(NullPointerException.class, () -> Algorithms.reverseString(null));
    }

    @Test
    void testCountWords() {
        // Test with special characters
        assertEquals(3, Algorithms.countWords("Hello, world! Test."));

        // Test with null input
        assertEquals(0, Algorithms.countWords(null));
    }

    @Test
    void testIsElementInSet() {
        Set<Integer> set = new HashSet<>(Set.of(1, 2, 3, 4, 5));

        // Test with null element
        assertFalse(Algorithms.isElementInSet(set, null));

        // Test with empty set
        Set<Integer> emptySet = new HashSet<>();
        assertFalse(Algorithms.isElementInSet(emptySet, 1));
    }


    @Test
    void testAddMatrices() {
        int[][] mat1 = {
                {1, 2},
                {3, 4}
        };
        int[][] mat2 = {
                {5, 6},
                {7, 8}
        };

        // Test with valid input
        int[][] expected = {
                {6, 8},
                {10, 12}
        };
        assertArrayEquals(expected, Algorithms.addMatrices(mat1, mat2));

        // Test with invalid input (different sizes)
        int[][] invalidMat = {
                {1, 2}
        };
        assertThrows(IllegalArgumentException.class, () -> Algorithms.addMatrices(mat1, invalidMat));
    }

}

