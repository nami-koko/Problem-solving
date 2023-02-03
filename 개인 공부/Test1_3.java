public class Test1_3 {
        public int main(int N) {
            int answer = 0;
            int[] dp;
            dp = new int[N + 1];
            dp[0] = 1;
            dp[1] = 1;
            if(N >= 2) {
                for(int i = 2; i <= N; i++) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
            }
            return dp[N];
        }
}
