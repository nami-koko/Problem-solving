class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cups = (int) money / 5500;
        int change = money - 5500 * cups;
        answer[0] = cups;
        answer[1] = change;
        return answer;
    }
}