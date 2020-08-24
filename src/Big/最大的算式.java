package Big;

import java.util.Scanner;

public class 最大的算式 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] dp = new long[n + 1][k + 1]; // 第0行不用,这里使用long
        int i, j, index;
        for (i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + sc.nextInt(); // 初始化第0列数组，是没有乘号的情况下的最大值（和）
        }

        for (j = 1; j <= k; j++) {    // 列数
            for (i = j + 1; i <= n; i++) {    // 行数
                for (index = 2; index <= i; index++) {    // 第几个值前面有*
                    //比较乘号放在每个位置的算式的大小，找出最大数
                    dp[i][j] = Math.max(dp[i][j], dp[index - 1][j - 1] * (dp[i][0] - dp[index - 1][0]));
                }
            }
        }

        System.out.println(dp[n][k]);

    }
}

/*
问题描述
　　题目很简单，给出N个数字，不改变它们的相对位置，在中间加入K个乘号和N-K-1个加号，（括号随便加）使最终结果尽量大。因为乘号和加号一共就是N-1个了，所以恰好每两个相邻数字之间都有一个符号。例如：
　　N=5，K=2，5个数字分别为1、2、3、4、5，可以加成：
　　1*2*(3+4+5)=24
　　1*(2+3)*(4+5)=45
　　(1*2+3)*(4+5)=45
　　……
输入格式
　　输入文件共有二行，第一行为两个有空格隔开的整数，表示N和K，其中（2<=N<=15, 0<=K<=N-1）。第二行为 N个用空格隔开的数字（每个数字在0到9之间）。
输出格式
　　输出文件仅一行包含一个整数，表示要求的最大的结果
样例输入
    5 2
    1 2 3 4 5
样例输出
    120
样例说明
　　(1+2+3)*4*5=120
 */