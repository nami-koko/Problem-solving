class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int drinks = n / 10 > 0 ? k - n/10 : k;
        answer = n * 12000 + drinks * 2000;
        return answer;
    }
}