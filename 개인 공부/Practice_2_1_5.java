import java.util.HashSet;

public class Practice_2_1_5 {
    public static int[] main(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        //두 배열에 모두 존재하는 정수 배열: 오름차순 정렬
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
