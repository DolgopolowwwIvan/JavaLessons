package LeetCode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 1; right < nums.length; right++) {
            if (nums[left] == 0) {
                if (nums[right] != 0) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                    left++;
                }

            } else {
                left++;
            }

        }

    }
}
