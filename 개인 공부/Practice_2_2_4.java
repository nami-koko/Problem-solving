import java.util.*;

public class Practice_2_2_4 {
    public static int main(int[] arr) {
        int answer = 0;
        List<Integer> intList = new ArrayList<>(arr.length);
        for (int i : arr) {
            intList.add(i);
        }
        Set<Integer> set = new HashSet<Integer>(intList);
        for (Integer num : set) {
            if(Collections.frequency(intList, num) != 2){
                answer = num;
            };
        }
        return answer;
    }
}
