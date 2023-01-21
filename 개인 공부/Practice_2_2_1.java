import java.util.*;

public class Practice_2_2_1 {
    public static String main(String s) {
        String answer = "";
        String[] arr = s.split("");
        List<Integer> intList = new ArrayList<>(arr.length);
        List<Integer> answerList = new ArrayList<>();
        for (String i : arr) {
            intList.add(Integer.parseInt(i));
        }
        Set<Integer> set = new HashSet<Integer>(intList);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : set) {
            map.put(num, Collections.frequency(intList, num));
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e -> answerList.add(e.getKey()));
        for(int i = 0; i < 10; i++) {
            if(!answerList.contains(i)) {
                answerList.add(i);
            }
        }
        return answer;
    }
}
