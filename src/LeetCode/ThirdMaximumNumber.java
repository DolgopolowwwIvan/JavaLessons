package LeetCode;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == firstMax || nums[i] == secondMax || nums[i] == thirdMax) {
                continue;
            }

            if (nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }
            else if (nums[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
            }
            else if (nums[i] > thirdMax) {
                thirdMax = nums[i];
            }
        }

        if (thirdMax == Long.MIN_VALUE){
            return (int)firstMax;
        }else {
            return  (int)thirdMax;
        }

    }
}
