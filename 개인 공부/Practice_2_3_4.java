import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_2_3_4 {
    public int main(int A, int B) {
        int answer = 0;
        List<String> strA = new ArrayList<>(Arrays.asList(Integer.toBinaryString(A).split("")));
        List<String> strB = new ArrayList<>(Arrays.asList(Integer.toBinaryString(B).split("")));
        if(strA.size() !=  strB.size()) {
            if(strA.size() > strB.size()) {
                int difference = strA.size() - strB.size();
                for(int i = 0; i < difference; i++) {
                    strB.add(i, "0");
                }
            }
        }
        for(int i=0; i < strA.size();i++){
            if(!strA.get(i).equals(strB.get(i))){
                answer++;
            }
        }
        return answer;
    }
}
