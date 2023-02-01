class Solution {
    public int solution(String s) {
        int answer = 0;
        int current = 0;
        for(String str: s.split(" ")) {
            if(str.equals("Z")) {
                answer -= current;
            } else {
                current = Integer.parseInt(str);
                answer += current;
            }
        }
        return answer;
    }
}