package LeetCode;

public class reverseString {
    public void reverseString1(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (end >= start){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            end--;
            start++;
        }
    }
}
