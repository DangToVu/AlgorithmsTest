package com.example.AdvanceUnitTest;

import java.util.*;

public class Algorithms {

    // 1. QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // 2. Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 3. String Processing
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) return 0;
        return input.trim().split("\\s+").length;
    }

    // 4. Set Operations
    public static boolean isElementInSet(Set<Integer> set, Integer element) {
        if (element == null) {
            return false; // hoặc xử lý khác nếu cần
        }
        return set.contains(element);
    }


    // 5. Matrix Operations
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        if (mat1 == null || mat2 == null) {
            throw new IllegalArgumentException("Matrices cannot be null.");
        }
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }

        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;
    }

}
