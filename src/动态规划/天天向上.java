package 动态规划;

import java.util.Scanner;

public class 天天向上 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n + 1];
        int[][] dp = new int[5][n + 1];
        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        /*
            dp[i][j]表示的是有i个递增数时，在第j个位置时，有多少种排列

            dp[2][j] += dp[1][i];
            如果存在2个递增数时，那么要加上1个递增数的排列数，即(3个递增是建立在2个递增之上)
         */

        for (int i = 1; i <= n; i++) {
            dp[1][i] = 1;
            for (int j = i + 1; j <= n; j++) {
                if (num[j] > num[i]) {//判断是否为递增
                    dp[2][j] += dp[1][i];
                    dp[3][j] += dp[2][i];
                    dp[4][j] += dp[3][i];
                }
            }
        }
        long sum = 0;
        for (int i = 4; i <= n; i++) {
            sum += dp[4][i];
        }
        System.out.println(sum);
    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　A同学的学习成绩十分不稳定，于是老师对他说：“只要你连续4天成绩有进步，那我就奖励给你一朵小红花。”可是这对于A同学太困难了。于是，老师对他放宽了要求：“只要你有4天成绩是递增的，我就奖励你一朵小红花。”即只要对于第i、j、k、l四天，满足i<j<k<l并且对于成绩wi<wj<wk<wl，那么就可以得到一朵小红花的奖励。现让你求出，A同学可以得到多少朵小红花。
输入格式
　　第一行一个整数n，表示总共有n天。第二行n个数，表示每天的成绩wi。
输出格式
　　一个数，表示总共可以得到多少朵小红花。
样例输入
    6
    1 3 2 3 4 5
样例输出
    6
数据规模和约定
　　对于40%的数据，n<=50；
　　对于100%的数据，n<=2000，0<=wi<=109。
 */
