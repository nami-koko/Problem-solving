import java.util.*;
import java.util.stream.Collectors;

//FIXME: 마지막 테스트케이스 런타임 에러

class Practice_3_3_2 {
    //int[] 내림차순 정렬
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public int main(int[] people, int limit) {
        int answer = 0;
        reverseSort(people);
        List<Integer> list = Arrays.stream(people).boxed().collect(Collectors.toList());
        while(list.size() > 0) {
            //list의 첫번째(가장 무거운 무게)가 limit - 마지막(가장 가벼운 무게)보다 크면 혼자 건너감(list.remove()와 answer++).
            if(list.get(0) > limit - list.get(list.size()-1)) {
                answer++;
                list.remove(0);
            } else {
                //아닐 경우, 둘씩 짝지어 태워보내고(remove) answer++.
                answer ++;
                list.remove(0);
                list.remove(list.size()-1);
            }
        }
        return answer;
    }
}