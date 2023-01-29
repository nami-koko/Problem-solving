class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        while(fact(num) <= n) {
            answer = num;
            num++;
        }
        return answer;
    }
	public static int fact(int n) {
		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;
	}
}