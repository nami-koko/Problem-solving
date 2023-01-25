//TODO: 동적계획법 확인
class Practice_3_3_5 {
    public int main(int[] arr) {
        //arr 안에서 최대의 연속된 구간의 정수 합 구하기
        int answer = 0;
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}