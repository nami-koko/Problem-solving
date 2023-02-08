class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] chars = my_string.toCharArray();
        char letter = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = letter;
        String answer = String.valueOf(chars);
        return answer;
    }
}