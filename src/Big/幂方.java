package Big;

import java.math.BigInteger;

public class 幂方 {
    public static void main(String[] args) {
        int N = 123456;
        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(3);
        BigInteger c = BigInteger.valueOf(2);
        BigInteger d = BigInteger.valueOf(3);

        for (int i = 1; i < N; i++) {
            BigInteger temp1 = a.multiply(c).subtract(b.multiply(d));
            BigInteger temp2 = b.multiply(c).add(a.multiply(d));
            a = temp1;
            b = temp2;
        }
        System.out.println(a);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(b);
    }
}

