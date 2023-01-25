class Practice_3_3_4 {
    public int main(int A) {
        int answer = 0;
        //화폐 단위
        int[] bills = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        //거스름돈 A를 거슬러줄 수 있는 최소한의 화폐 개수 구하기
        for(int i = 0; i < bills.length; i++) {
            if(A >= 0 && A % bills[i] >= 0) {
                int count = A / bills[i];
                answer += count ;
                A -= count * bills[i];
            }
        }
        return answer;
    }
}