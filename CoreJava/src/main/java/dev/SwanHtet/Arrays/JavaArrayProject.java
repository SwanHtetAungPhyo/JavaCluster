package dev.SwanHtet.Arrays;

import java.util.Arrays;

public class JavaArrayProject {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 3};
        System.out.println("Original: " + Arrays.toString(numbers));

        // Sort the array
        sortArray(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // Search for an element
        int searchValue = 3;
        int index = searchInArray(numbers, searchValue);
        System.out.println("Index of " + searchValue + ": " + index);

        // Fill the array with a value
        fillArray(numbers, 0);
        System.out.println("Filled with 0: " + Arrays.toString(numbers));

        // Declare and initialize a string array
        String[] fruits = {"Banana", "Cherry", "Apple"};
        System.out.println("Fruits: " + Arrays.toString(fruits));

        // Sort fruits array
        sortArray(fruits);
        System.out.println("Sorted Fruits: " + Arrays.toString(fruits));

        // Copy the fruits array
        String[] copiedFruits = copyArray(fruits, 2);
        System.out.println("Copied Fruits (first 2): " + Arrays.toString(copiedFruits));
    }

    // Method to sort an array of integers
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    // Method to sort an array of strings
    public static void sortArray(String[] array) {
        Arrays.sort(array);
    }

    // Method to search for an element in an array
    public static int searchInArray(int[] array, int value) {
        return Arrays.binarySearch(array, value);
    }

    // Method to fill an array with a specific value
    public static void fillArray(int[] array, int value) {
        Arrays.fill(array, value);
    }

    // Method to copy an array with a new length
    public static String[] copyArray(String[] originalArray, int newLength) {
        return Arrays.copyOf(originalArray, newLength);
    }
}
