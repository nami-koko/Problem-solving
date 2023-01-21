import java.util.ArrayList;
import java.util.List;

public class Practice_2_3_2 {
    public int[] main(int[] nums) {
        int[] answer = {};
        List<Integer> givenNums = new ArrayList<Integer>(nums.length);
        for (int num : nums) {
            givenNums.add(num);
        }
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1; i<=nums.length; i++){
            numbers.add(i);
        }
        numbers.removeAll(givenNums);
        answer = numbers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
