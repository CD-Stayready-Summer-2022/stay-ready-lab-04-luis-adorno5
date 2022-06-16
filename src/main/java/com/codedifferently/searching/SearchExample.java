package com.codedifferently.searching;

import com.codedifferently.sorting.SortExample;

public class SearchExample {

    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        int[] sortedNumbers = SortExample.selectionSort(numbers);
        System.out.println(binarySearch(sortedNumbers, 7));
    }

    public static Boolean sequentialSearch(int[] numbers, int value){
        for (int number : numbers) {
            if (number == value) {
                return true;
            }
        }
        return false;
    }

    public static Boolean binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length-1;
        while (high >= low){
            int middle = (low + high)/2;
            if(numbers[middle] == value){
                return true;
            }
            if(numbers[middle] < value){
                low = middle + 1;
            }
            if(numbers[middle] > value){
                high = middle - 1;
            }
        }
        return false;
    }

    public static void displayValues(int[] numbers){
        for(int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

}
