class Solution {
    public int solution(int hp) {
        int general = 5;
        int soldier = 3;
        int worker = 1;
        int count = 0;
        count += hp / general;
        hp = hp % general;
        count += hp / soldier;
        hp = hp % soldier;
        count += hp / worker;
        hp = hp % worker;

        return count;
    }
}