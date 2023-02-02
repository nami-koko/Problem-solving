class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int index = 0;
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            if(sides[i] > max) {
                index = i;
                max = sides[i];
            }
        } 
        for (int i = 0; i < sides.length; i++) {
            if(i != index) {
                sum += sides[i];
            }
        } 
        
        
        
        return sum > max ? 1: 2;
    }
}