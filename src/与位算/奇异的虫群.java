package 与位算;

import java.util.Scanner;

public class 奇异的虫群 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(quickFib(n));
    }

    static long mod = 1000000007;
    static long quickAdd(long a, long b) {
        long ans = 0;
        while(b > 0) {
            if((b & 1) == 1) ans = (ans + a) % mod;
            a = (a << 1) % mod;
            b >>= 1;
        }
        return ans % mod;
    }

    static long[][] quickMulti(long[][] a, long[][] b) {
        long[][] ans = new long[2][2];
        long tmp = 0;
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 2; j ++) {
                tmp = 0;
                for(int k = 0; k < 2; k ++) {
                    tmp = (tmp + quickAdd(a[i][k], b[k][j])) % mod;
                }
                ans[i][j] = tmp;
            }
        }
        return ans;
    }

    static long[][] quickPow(long[][] a, long b) {
        long[][] ans = new long[2][2];
        ans[0][0] = ans[1][1] = 1;
        ans[0][1] = ans[1][0] = 0;
        while(b > 0) {
            if((b & 1) == 1) ans = quickMulti(ans, a);
            a = quickMulti(a, a);
            b >>= 1;
        }
        return ans;
    }

    static long quickFib(long a) {
        long[][] ans = new long[2][2];
        long[][] tmp = new long[2][2];
        tmp[0][0] = tmp[0][1] = tmp[1][0] = 1;
        tmp[1][1] = 0;
        ans = quickPow(tmp, a);
        return ans[0][0] % mod;
    }

}
