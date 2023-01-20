import java.util.List;
import java.util.ArrayList;

class Practice_2_2_2 {
    public int[] main(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if(arr[i] % 2 == 1) {
                list.add(arr[i]);
            }
        }
        answer = list.subList(0, arr.length).stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}