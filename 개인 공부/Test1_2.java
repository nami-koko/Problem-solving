import java.util.HashSet;

public class Test1_2 {
         public int main(String[] names) {
            int answer = 0;
            HashSet<String> set = new HashSet<>();
            for(String name : names) {
                set.add(name);
            }
            answer = combi(set.size(), 4);
            return answer;
        }

        static int combi(int n, int r){
            if(r==0 || r==n)
                return 1;
            else
                return combi(n-1, r-1) + combi(n-1, r);
        }
    }
