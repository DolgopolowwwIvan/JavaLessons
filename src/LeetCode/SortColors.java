package LeetCode;

import java.util.Random;

public class SortColors {

    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length);
    }
    public static void quickSort(int[] array, int lowIndex, int highIndex){

        if (lowIndex >= highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        // тут цикл закончился и нужно поменять
        // lp == rp с последним элементом - пивотом
        swap(array,leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            // Проходим левым указателем по массиву,
            // чтобы он был меньше pivot
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            // Проходим правым указателем по массиву,
            // чтобы он был больше pivot

            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, rightPointer, leftPointer);
        }
        return leftPointer;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
