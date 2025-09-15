//package LeetCode;
//
//public class SortArrayByParity {
//
//    public static void main(String[] args) {
//        int[] nums = {0,2};
//        int[] aa = sortArrayByParity(nums);
//        for (int i: aa){
//            System.out.println(i);
//        }
//    }
//
//    public static int[] sortArrayByParity(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        if (nums.length > 2) {
//            while (start < end) {
//                if (nums[start] % 2 != 0) {
//                    //end odd
//                    if (nums[end] % 2 == 0) {
//                        int temp = nums[start];
//                        nums[start] = nums[end];
//                        nums[end] = temp;
//                        start++;
//                        end--;
//                    }
//                    // end even
//                    else if (nums[end] % 2 != 0) {
//                        end--;
//                    }
//                }else {start++;}
//            }
//        }else {
//            return nums;
//        }
//
//        return nums;
//    }
//}
