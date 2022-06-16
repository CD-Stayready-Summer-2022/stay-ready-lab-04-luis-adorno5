package com.codedifferently.searching;

import com.codedifferently.sorting.SortExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchExampleTest {

    private int[] numbers;

    @BeforeEach
    public void init(){
        numbers = new int[]{1, 4, 7, 40, 59};
    }

    @Test
    @DisplayName("Sequential search test.")
    public void sequentialSearchTest(){
        Boolean actual = SearchExample.sequentialSearch(numbers, 59);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Binary search test.")
    public void binarySearchTest01(){
        Boolean actual = SearchExample.binarySearch(numbers, 7);
        Assertions.assertTrue(actual);
    }

}
