class Solution {
    public String solution(String phone_number) {
        String[] arr = phone_number.split("");
        for(int i = arr.length-5; i >= 0; i--){
            arr[i] = "*";
        }
        return String.join("", arr);
    }
}