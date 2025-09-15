package LeetCode;

import java.util.List;

public class Largest3SameDigitNumberinString {

    private List<String> sameDigitNumbers = List.of("999", "888", "777", "666", "555", "444", "333", "222", "111", "000");

    public String largestGoodInteger(String num) {

        for (String sameDigitNumber : sameDigitNumbers) {
            if (contains(sameDigitNumber, num)) {
                return sameDigitNumber;
            }
        }

        return "";
    }

    public boolean contains(String sameDigitNumber, String num){
        for (int i = 0; i < num.length() - 3; i++) {

            char first = num.charAt(i);
            char second = num.charAt(i + 1);
            char third = num.charAt(i + 2);

            if (first == sameDigitNumber.charAt(0)
                    && second == sameDigitNumber.charAt(1)
                    && third == sameDigitNumber.charAt(2)){
                return true;
            }

        }
        return false;
    }

}
