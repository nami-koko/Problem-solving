class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String s: strlist) {
            answer[i] = s.length();
            i++;
        }
        return answer;
    }
}