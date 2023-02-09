class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            int sign = signs[i] ? 1 : -1;
            answer += (int) absolutes[i] * sign;
        }
        return answer;
    }
}