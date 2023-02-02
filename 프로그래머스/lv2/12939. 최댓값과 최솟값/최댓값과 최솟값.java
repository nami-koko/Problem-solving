import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[s.split(" ").length];
        int i = 0;
        for(String str: s.split(" ")){
            arr[i++] = Integer.parseInt(str);
        }
        Arrays.sort(arr);
        answer += arr[0];
        answer += " " + arr[arr.length-1];

        return answer;
    }
}