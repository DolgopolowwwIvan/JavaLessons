package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

//class Solution {
//    public static void main(String[] args) {
//        int[] nums = {-1,-2,-3,-4,-5};
//        int target = -8;
//        int[] answer = twoSum(nums, target);
//        System.out.println(Arrays.toString(answer));
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//           int component = target - nums[i];
//           if(map.containsKey(component)){
//               return  new int[]{map.get(component), i};
//           }
//           map.put(nums[i],i);
//        }
//        throw new IllegalArgumentException();
//    }
//}

