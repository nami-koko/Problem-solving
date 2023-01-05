class Solution {
    public String solution(String rsp) {
        String answer = "";
        int inputLen = rsp.length();
        String[] numbers = new String[inputLen];
        for (int i = 0; i < inputLen; i++) {
            char letter = rsp.charAt(i);
            if (letter == '2') {
                numbers[i] = "0";
            } else if (letter == '0') {
                numbers[i] = "5";
            } else {
                numbers[i] = "2";
            }
            answer += numbers[i];
        }

        return answer;
    }
}