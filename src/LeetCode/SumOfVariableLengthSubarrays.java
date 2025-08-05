package LeetCode;

public class SumOfVariableLengthSubarrays {

    public int subarraySum(int[] nums) {
        int total = 0;

        for (int i = 1; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j < i; j++) {
                total += nums[j] + nums[j-1];
            }
        }

        return total;

    }
}
