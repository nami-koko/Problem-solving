import java.util.Arrays;
import java.util.HashMap;

public class Practice_2_1_3 {
    public static void main(String p, String s) {
        boolean answer = true;
        String[] pArr = p.split("");
        String[] sArr = s.split(" ");
        HashMap<String, String> map = new HashMap<>();


        //중복이 제거된 배열
        String[] tempPArr = Arrays.stream(pArr).distinct().toArray(String[]::new);
        System.out.println("tempPArr: " + Arrays.toString(tempPArr));
        for (int i = 0; i < tempPArr.length; i++) {
            map.put(tempPArr[i], sArr[i]);
        }

        String[] tempSArr = new String[sArr.length];
        for (int i = 0; i < pArr.length; i++) {
            tempSArr[i] = map.get(pArr[i]);
        }
        System.out.println("tempSArr: " + Arrays.toString(tempSArr));
        System.out.println("sArr: " + Arrays.toString(sArr));

        if (!Arrays.equals(sArr, tempSArr)) {
            answer = false;
        }
        System.out.println("answer = " + answer);
    }
}
