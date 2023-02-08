class Solution {
    public long solution(long n) {
        double root = Math.sqrt(n);
        if(root == (int)root) {
            return (long)Math.pow((int)root + 1, 2);
        } 
        return -1;
    }
}