import java.util.Arrays;

public class Practice_1_1_3 {
    public static void main(String[] args) {
        int[] A = {100000, 99000, 99000, 98000, 97000};

        int buyIndex = 0;
        int sellIndex = 0;
        int profit = 0;
        //매수
        int minPrice = Arrays.stream(A).min().getAsInt();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == minPrice) {
                buyIndex = i;
            }
        }

        //매도
        for (int i = buyIndex + 1; i < A.length; i++) {
            int margin = A[i] - A[buyIndex];
            if(profit < margin) {
                profit = margin;
                sellIndex = i;
            }
        }

        int answer;
        answer = buyIndex == A.length -1 ? 0 : profit;

    }
}
