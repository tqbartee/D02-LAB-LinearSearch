package edu.desu.sortsearchutils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    @Test
    @DisplayName("Test linear search when target element exists in the array")
    void testTargetPresent() {
        int[] numbers = {10, 25, 30, 42, 55, 99};

        // Target at the beginning
        Assertions.assertTrue(LinearSearch.linearSearch(numbers, 10));

        // Target in the middle
        Assertions.assertTrue(LinearSearch.linearSearch(numbers, 42));

        // Target at the end
        Assertions.assertTrue(LinearSearch.linearSearch(numbers, 99));
    }

    @Test
    @DisplayName("Test linear search when target element does not exist in the array")
    void testTargetNotPresent() {
        int[] numbers = {10, 25, 30, 42, 55, 99};

        Assertions.assertFalse(LinearSearch.linearSearch(numbers, 7));
        Assertions.assertFalse(LinearSearch.linearSearch(numbers, 100));
        Assertions.assertFalse(LinearSearch.linearSearch(numbers, -1));
    }

    @Test
    @DisplayName("Test linear search on an empty array")
    void testEmptyArray() {
        int[] numbers = {};

        Assertions.assertFalse(LinearSearch.linearSearch(numbers, 5));
    }

    @Test
    @DisplayName("Test linear search on a single-element array")
    void testSingleElementArray() {
        int[] numbers = {42};

        Assertions.assertTrue(LinearSearch.linearSearch(numbers, 42));
        Assertions.assertFalse(LinearSearch.linearSearch(numbers, 10));
    }

    @Test
    @DisplayName("Test linear search with duplicate values in the array")
    void testDuplicateElements() {
        int[] numbers = {5, 3, 5, 8, 5};

        Assertions.assertTrue(LinearSearch.linearSearch(numbers, 5));
        Assertions.assertFalse(LinearSearch.linearSearch(numbers, 2));
    }
}
