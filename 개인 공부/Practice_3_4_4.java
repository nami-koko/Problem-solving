public class Practice_3_4_4{
        public int main(int[] arr) {
            int count = 0;
            int answer = 0;
            //1과 0으로 이루어진 정수 배열에서 1의 최대 연속 자릿수(answer) 구하기
            for(int i : arr) {
                //i가 2로 나누어 떨어지면
                if(i % 2==1) {
                    //s에 1씩 더하고 최대연속자릿수 answer에 저장
                    count++;
                    if(count>=answer)
                        answer=count;
                }else{
                    //i가 0이면 count만 0으로 초기화하고, answer은 유지
                    count=0;
                }
            }

            return answer;
        }
}
