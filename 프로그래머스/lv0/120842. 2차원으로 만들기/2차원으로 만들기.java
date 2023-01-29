class Solution {
    public int[][] solution(int[] num_list, int n) {
        int groups = num_list.length/n;
        int[][] answer = new int[groups][n];
        int idx = 0;
        for(int i = 0; i < groups; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}