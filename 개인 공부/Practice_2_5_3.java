import java.util.Collections;
import java.util.PriorityQueue;

public class Practice_2_5_3 {
    public int main(int[] cards) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //데크에 카드 추가
        for(int i = 0; i < cards.length; i++) {
            pq.add(cards[i]);
        }

        //마지막 카드 하나가 남을때까지:
        //첫번째, 두번째로 큰 수 뽑아서 빼기 연산 후 나머지를 카드에 다시 넣기
        while(pq.size() > 1) {
            int num1 = pq.poll();
            int num2 = pq.poll();
            pq.add(num1 - num2);
        }

        //마지막에 남은 카드가 정답
        answer = pq.poll();
        return answer;
    }
}
