public class Test1_1 {
        public int main(int n) {
            int prime = 0;
            for (int i = 2; i <= n; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) count++;
                }
                if (count == 2) prime++;
            }
            return prime;
        }
}
