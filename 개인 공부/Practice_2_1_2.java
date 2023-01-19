import java.util.Arrays;

public class Practice_2_1_2 {
    public static int main(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        int average = (int)sum / (arr.length - 2);
        return average;
    }
}
