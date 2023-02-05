class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String one: s1) {
            for(String two: s2) {
                if(one.equals(two)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}