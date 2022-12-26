class Solution {
    public int solution(int n) {
        int answer = 0;
        //6과 n의 최소공배수 L
        int min = (6 < n) ? 6 : n; 
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (6 % i == 0 && n % i == 0)
				gcd = i;
		}
        int lcm = (6 * n) / gcd;
        //answer = L / 6
        answer = lcm / 6;
        return answer;
    }
}