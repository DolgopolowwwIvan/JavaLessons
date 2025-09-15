package LeetCode;

public class FindtheIndex_28 {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        int[] lps = new int[needle.length()];
        int prefix = 0;

        for (int i = 1; i < needle.length(); i++) {
            while (prefix > 0 && needle.charAt(i) != needle.charAt(prefix)) {
                prefix = lps[prefix - 1];
            }

            if (needle.charAt(prefix) == needle.charAt(i)) {
                prefix++;
                lps[i] = prefix;
            }

        }

        int n = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (n > 0 && needle.charAt(n) != haystack.charAt(i)) {
                n = lps[n - 1];
            }

            if (needle.charAt(n) == haystack.charAt(i)) {
                n++;
            }
            if (n == needle.length()) {
                return i - n + 1;
            }
        }

        return -1;

    }
}
