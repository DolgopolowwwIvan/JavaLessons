package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] GreaterVal = new int[10001];
        Arrays.fill(GreaterVal, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1 ; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()){
                GreaterVal[i] = stack.peek();
            }

            stack.push(nums2[i]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = GreaterVal[nums1[i]];
        }
        return result;
    }
}
