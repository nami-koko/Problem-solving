import java.util.HashSet;

public class Practice_2_1_4 {
    public static void main(String s) {
        String[] arr = s.split(" ");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int answer = set.size();
    }
}
