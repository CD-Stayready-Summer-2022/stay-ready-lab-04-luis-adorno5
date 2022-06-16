package com.codedifferently;

public class SortExample {

    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);
        int[] sortedNumbers = bubbleSort(numbers);
        displayValues(sortedNumbers);
    }

    public static int[] selectionSort(int[] numbers){
        int indexMin = 0;
        for(int i = 0; i < numbers.length; i++){
            indexMin = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[indexMin]){
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
        return numbers;
    }

    public static int[] bubbleSort(int[] numbers){
        for (int i = 0; i< numbers.length; i++){
            for(int j = 0; j< numbers.length-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }

    public static void displayValues(int[] numbers){
        for(int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

}
