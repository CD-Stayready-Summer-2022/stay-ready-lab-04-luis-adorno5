package com.codedifferently.sorting;

import com.codedifferently.sorting.SortExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortExampleTest {

    private int[] numbers;

    @BeforeEach
    public void init(){
        numbers = new int[]{40, 7, 59, 4, 1};
    }

    @Test
    @DisplayName("Selection sort test.")
    public void selectionSortTest01(){
        int[] expected = {1, 4, 7, 40, 59};
        int[] actual = SortExample.selectionSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Bubble sort test.")
    public void bubbleSortTest01(){
        int[] expected = {1, 4, 7, 40, 59};
        int[] actual = SortExample.bubbleSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }

}
