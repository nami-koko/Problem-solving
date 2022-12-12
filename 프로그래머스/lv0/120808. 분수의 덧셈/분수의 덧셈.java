class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        answer[0] = num1*denum2 + num2*denum1;
        answer[1] = num1 * num2;
        int min = Math.min(answer[0], answer[1]);
        int max = 1;
        for (int i = 1; i <= min; i++) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                max = i;
            }
        }
        answer[0] /= max;
        answer[1] /= max;

        return answer;
    }
}