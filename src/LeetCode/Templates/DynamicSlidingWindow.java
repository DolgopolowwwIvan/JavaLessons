package LeetCode.Templates;

//    Два указателя: используем left (начало окна) и right (конец окна)
//    Гибкое окно: размер окна может увеличиваться и уменьшаться в процессе работы
//    Условие: определяет, когда нужно расширять или сужать окно

public class DynamicSlidingWindow {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // Расширяем окно

            while (sum >= target) { // Проверяем условие
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left]; // Сужаем окно
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
