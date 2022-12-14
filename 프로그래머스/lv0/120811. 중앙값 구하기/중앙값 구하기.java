import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //sort array
        Arrays.sort(array);
        //array 길이 절반의 인덱스의 값 리턴
        int index = array.length / 2;
        answer = array[index];
        return answer;
    }
}