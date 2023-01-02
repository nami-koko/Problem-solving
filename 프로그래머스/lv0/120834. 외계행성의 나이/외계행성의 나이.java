class Solution {
    public String solution(int age) {
        String answer = "";
        int places = (int) (Math.log10(age) + 1);
        for (int i = places - 1; i >= 0; i--) {
            int num = (int) (age / Math.pow(10, i));
            age -= num * Math.pow(10, i);
            answer += (char) (num + 97);
        }
        return answer;
    }
}