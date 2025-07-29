package LeetCode;



public class SolutionDayly {

    public static void main(String[] args) {
        String s = "leeeetcooodee";
        s += "  ";
        char[] characters = s.toCharArray();

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length() - 2; i++) {
            char one = characters[i];
            char two = characters[i + 1];
            char three = characters[i + 2];

            if(one == two && one == three){
                continue;
            }else {
                answer.append(one);
            }

        }

        String finalAnswer = answer.toString();
    }

}
