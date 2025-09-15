package LeetCode;

public class removeDuplicates {
    public int removeDuplicates1(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i + 1] == nums[i]){
                nums[k] = nums[i+1];
                k++;
            }
        }

        return k;
    }
}
