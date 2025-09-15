package LeetCode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
             if(nums[i] != nums[k]){
                 k++;
                 nums[k] = nums[i];
             }

        }

        return k + 1;
    }
}

