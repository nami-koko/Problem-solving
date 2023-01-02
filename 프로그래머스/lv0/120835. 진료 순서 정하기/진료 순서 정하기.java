class Solution {
    public int[] solution(int[] emergency) {
        int arrLen = emergency.length;
        int[] answer = new int[arrLen];
        for(int i = 0; i < arrLen; i++) {
            for(int j = 0; j < arrLen; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}