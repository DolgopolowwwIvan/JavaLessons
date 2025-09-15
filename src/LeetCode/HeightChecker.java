package LeetCode;

import java.util.Arrays;

public class HeightChecker {

//    public static void main(String[] args) {
//        int[] heights = {1,1,4,2,1,3};
//        int answer = heightChecker(heights);
//
//        System.out.println(answer);
//    }
//
//    public static int heightChecker(int[] heights) {
//
//        int[] tempArray = Arrays.copyOf(heights, heights.length);
//
//        int[] expected = quickSort(heights,0, heights.length - 1);
//
//        int output = 0;
//
//        for (int i = 0; i < heights.length; i++) {
//            if (expected[i] != tempArray[i]){
//                output++;
//            }
//        }
//
//        return output;
//    }
//
//    public static int[] quickSort(int[] array, int start, int end){
//        if (end <= start){
//            return array;
//        }
//
//        int pivot = partition(array, start, end);
//
//        //leftSide
//        quickSort(array, start, pivot - 1);
//        //rightSide
//        quickSort(array, pivot + 1, end);
//
//        return array;
//
//    }
//
//    public static int partition(int[] array, int start, int end){
//
//        int pivot = array[end];
//        int i = start - 1;
//        int temp;
//
//        for (int j = start; j <= end - 1 ; j++) {
//            if(array[j] < pivot){
//                i++;
//                temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//        i++;
//        temp = array[i];
//        array[i] = array[end];
//        array[end] = temp;
//
//        return  i;
//    }

    public void sortColors(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int i : nums) {
            if (i == 0) {
                zeros++;
            }

            if (i == 1) {
                ones++;
            }

            if (i == 2) {
                twos++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeros > 0) {
                nums[i] = 0;
                zeros--;
            }
            if (ones > 0) {
                nums[i] = 1;
                ones--;
            }
            if (twos > 0) {
                nums[i] = 2;
                twos--;
            }
        }
    }

}
