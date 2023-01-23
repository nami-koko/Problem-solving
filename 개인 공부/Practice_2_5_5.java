public class Practice_2_5_5 {
    private static boolean checkMinHeap(int[] A, int i){
        if (2 * i + 2 > A.length) {
            return true;
        }
        boolean left = (A[i] <= A[2 * i + 1]) && checkMinHeap(A, 2 * i + 1);
        boolean right = (2 * i + 2 == A.length) || (A[i] <= A[2 * i + 2] && checkMinHeap(A, 2 * i + 2));
        return left && right;
    }

    public String main(int[] arr) {
        String answer = "";
        int i = 0;
        answer = checkMinHeap(arr, i) ? "YES" : "NO";
        return answer;
    }
}


