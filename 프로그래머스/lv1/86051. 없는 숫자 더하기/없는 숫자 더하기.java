import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list1 = new ArrayList<Integer>(numbers.length);
        List<Integer> list2 = new ArrayList<Integer>(9);
        for (int i : numbers){
            list1.add(i);
        }
        for(int i = 1; i <= 9; i++) {
            list2.add(i);
        }
        list2.removeAll(list1);
        for(int i: list2) {
            answer += i;
        }
        return answer;
    }
}