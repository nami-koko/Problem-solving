public class Practice_2_2_3 {
    public int main(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int cr = (int) Math.round(Math.pow(i, 1.0/3.0));
            if(cr*cr*cr == i) {
                answer = i;
            }
        }
        return answer;
    }
}
