import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}