package LeetCode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertPointer = m + n -1;
        int firstPointer = m - 1;
        int secondPointer = n - 1;

        while (firstPointer >= 0 && secondPointer >= 0) {
            if (nums1[firstPointer] > nums2[secondPointer]){
                nums1[insertPointer] = nums1[firstPointer];
                nums1[firstPointer] = -1;
                firstPointer--;
            }
            else {
                nums1[insertPointer] = nums2[secondPointer];
                secondPointer--;
            }
        }


    }
}

