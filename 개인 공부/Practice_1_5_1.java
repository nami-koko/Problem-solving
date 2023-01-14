import java.util.Collections;
import java.util.ArrayList;

class Practice_1_5_1 {
    public String solution(String s) {
        String answer = "";
        int[] alphabet = new int[26];
        ArrayList<String> maxList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                alphabet[s.charAt(i) - 'a']++;
            }
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max == alphabet[i]) {
                char ch = (char) (i + 'a');
                maxList.add(Character.toString(ch));// 동일한 횟수로 가장 많이 등장하는 문자 담기
            }
        }
        Collections.sort(maxList); //알파벳 순으로 정렬
        answer = maxList.get(0); //가장 앞 문자
        return answer;
    }
}