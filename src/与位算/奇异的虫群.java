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
        while (b > 0) {
            if ((b & 1) == 1) ans = (ans + a) % mod;
            a = (a << 1) % mod;
            b >>= 1;
        }
        return ans % mod;
    }

    static long[][] quickMulti(long[][] a, long[][] b) {
        long[][] ans = new long[2][2];
        long tmp = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                tmp = 0;
                for (int k = 0; k < 2; k++) {
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
        while (b > 0) {
            if ((b & 1) == 1) ans = quickMulti(ans, a);
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
/*
问题描述
　　在一个奇怪的星球上驻扎着两个虫群A和B，它们用奇怪的方式繁殖着，在t+1时刻A虫群的数量等于t时刻A虫群和B虫群数量之和，t+1时刻B虫群的数量等于t时刻A虫群的数量。由于星际空间的时间维度很广阔，所以t可能很大。OverMind 想知道在t时刻A虫群的数量对 p = 1,000,000,007.取余数的结果。当t=1时 A种群和B种群的数量均为1。
输入格式
　　测试数据包含一个整数t，代表繁殖的时间。
输出格式
　　输出一行，包含一个整数，表示对p取余数的结果
样例输入
10
样例输出
89
样例输入
65536
样例输出
462302286
数据规模和约定
　　对于50%的数据 t<=10^9
　　对于70%的数据 t<=10^15
　　对于100%的数据 t<=10^18
 */
