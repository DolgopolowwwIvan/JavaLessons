package com.walking.Grokking_algorithms.SelectionSort;

public class SelectionSort {

    public static int [] selectionSort(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int smallest = findSmallest(arr);
            newArray[i] = arr[smallest];
            arr[smallest] = 999999;
        }
        return newArray;
    }

    private static int findSmallest(int[] arr){
        int smallest = arr[0];
        int smallest_index = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
                smallest_index = i;
            }
        }

        return smallest_index;
    }
}
