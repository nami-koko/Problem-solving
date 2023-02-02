import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(my_string.split("")));
        for(String s : set) {
            answer += s;
        }
        return answer;
    }
}