package LeetCode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newStr = s.toLowerCase().replaceAll("[^a-zA-Z]", "");
        char[] chars = newStr.toCharArray();
        int start = 0;
        int end = newStr.length() - 1;

        if (chars.length == 2){
            if (chars[0] == chars[1]){
                return true;
            }
            else {
                return false;
            }
        }else {
            while (end > start){
                if (chars[end] == chars[start]){
                    end--;
                    start++;
                }else {return false;}
            }
        }

        return true;

    }
}
