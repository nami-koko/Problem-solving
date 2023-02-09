class Solution {
    boolean solution(String s) {
        int pcount = 0;
        int ycount = 0;
        for(String str: s.split("")){
            if(str.equals("P") || str.equals("p")){
                pcount++;
            } else if(str.equals("Y") || str.equals("y")){
                ycount++;
            }
        }

        return pcount == ycount;
    }
}