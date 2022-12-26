import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] numArray = new int[1001];
        
        for (int i = 0; i < array.length; i++) {
            numArray[array[i]]++;
        }
        
        int max = 0;
        int max_index = 0;
        
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i]> max){
                max = numArray[i];
                max_index = i;
            }
        }
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] == max) count++;
        }
        
        if (count > 1) return -1;
        answer = max_index;
        return answer;
    }
}