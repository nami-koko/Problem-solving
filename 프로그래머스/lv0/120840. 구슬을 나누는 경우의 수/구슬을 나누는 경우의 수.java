import java.math.BigInteger;
class Solution {
  public BigInteger solution(int balls, int share) {
        return factorial(balls).divide((factorial(balls-share).multiply(factorial(share))));
    }
    public BigInteger factorial(int num) {
        BigInteger bigInt = new BigInteger("1");
        for(int i=1; i<=num; i++) {
            bigInt = bigInt.multiply(new BigInteger(Integer.toString(i)));
        }
        return bigInt;
    }
}
