package Big;

/**
 * 几个数字做模2的加法，如果为0，无论怎么拿结果都不为0 ，如果不为0 ，总有办法改变一个数字把它变成0
 * 011
 * 100
 * 101
 * ----
 * 010
 * 现在不为0，我们改变第二位就可以将结果变为0
 */
public class 取石子异或 {
    public static void main(String[] args) {
        int[] A = {5, 10, 15};
        System.out.println(solve(A));
    }

    public static boolean solve(int[] A) {
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            res ^= A[i];
            // System.out.println(Integer.toBinaryString(A[i]));
        }
        return res != 0;
    }
}
/*
Nim游戏
-共有N堆石子,编号1..n ,第i堆中有个a[]个石子。
每一次操作Alice和Bob可以从任意-堆石子中取出任意数量的石子,
至少取一颗,至多取出这一堆剩下的所有石子。
两个人轮流行动,取光所有石子的一-方获胜。Alice为先手。
给定a,假设两人都采用最优策略,谁会获胜?

 */

