package LeetCode.Templates;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class MootonicStack {
    public static int[] monotonicStackTemplate(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && violatesMonotonicProperty(nums[stack.peek()], nums[i])) {
                int index = stack.pop();
                result[index] = i; // Пример: сохраняем индекс следующего большего элемента
            }
            stack.push(i);
        }
        return result;
    }
}
