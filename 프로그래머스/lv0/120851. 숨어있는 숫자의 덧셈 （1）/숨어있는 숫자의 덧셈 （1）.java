class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] chars = my_string.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                answer += Character.getNumericValue(c);
            }
        }
        return answer;
    }
}