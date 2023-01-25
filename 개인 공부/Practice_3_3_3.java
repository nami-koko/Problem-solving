import java.util.*;

class Practice_3_3_3 {
    public int main(int[] A) {
        int answer = 0;
        int[] arr = new int[A.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int a : A) {
            pq.add(a);
        }

        //arr의 뒤에서부터 홀수 순서에 큰 수 배치
        for (int i = arr.length - 1; i >= 0; i--) {
            if(i % 2 == 0) {
                arr[i] = pq.poll();
            }
        }
        //arr의 앞에서부터 짝수 순서에 pq에 남아있는 수를 차례로 배치
        //답안에 필요한 연산도 같이 수행
        for (int i = 0; i < arr.length ; i++) {
            if(i % 2 != 0) {
                arr[i] = pq.poll();
                answer += arr[i] * ((i + 1) * -1);
            } else {
                answer += arr[i] * (i + 1);
            }
        }
        return answer;
    }
}