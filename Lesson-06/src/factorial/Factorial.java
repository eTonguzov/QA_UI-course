package factorial;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        BigInteger a = factorialClassic(70);
        System.out.println(a);

    }
    public static BigInteger factorialClassic(int n){
        BigInteger result  = BigInteger.ONE;
        for (int i = 1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
            return result;
    }
}

