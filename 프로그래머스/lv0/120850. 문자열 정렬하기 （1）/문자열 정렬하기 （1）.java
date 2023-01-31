import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        char[] chars = my_string.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                list.add(Character.getNumericValue(c));
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i).intValue();
        }
        Arrays.sort(answer);
        return answer;
    }
}