import java.util.Arrays;

public class Practice_2_1_1 {
    public static int main(int[] arr) {
        int answer = 0;
        int line1 = 0;
        int line2 = 0;
        int line3 = 0;
        //arr로 주어지는 랜덤한 정수들: 오름차순 정렬
        Arrays.sort(arr);

        //삼각형의 조건: 가장 긴 변의 길이 < 다른 두 변의 길이
        for (int i = 2; i < arr.length ; i++) {
            int[] tempArr = new int[i];
            for(int a = 0; a < tempArr.length; a++) {
                tempArr[a] = arr[a];
            }
            for (int j = 0; j < tempArr.length ; j++) {
                for (int k = j + 1; k < tempArr.length; k++) {
                    if((arr[j] + arr[k]) > arr[i]) {
                        line1 = arr[i];
                        line2 = arr[j];
                        line3 = arr[k];
                    }
                }
            }
        }
        answer = line1 + line2 + line3;
        return answer;
    }
}
