package Big;

import java.util.Scanner;

//解题思路图在项目中
public class k好数 {
    final static int maxn = 100;
    final static int M = 1000000007;
    static int d[][] = new int[maxn + 5][maxn + 5];//d[i][j]表示将i位置的值置为j时的k好数的个数

    /*
		由分析，其状态转移方程从最低+1位开始，d[i][j]= ∑d[i-1][r](r!=j+1&&r!=j-1&&0<=r<=k-1)
		最高位j！=0，需特殊处理
		其初始条件为d[0][j]=1;不受约束
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();

        for (int j = 0; j < k; j++) {
            d[0][j] = 1;
        }
        for (int i = 1; i < l; i++)//i=0已经初始化过了
        {
            for (int j = 0; j < k; j++)//求第i个位置放置每一个值时d[i][j]的大小;
            {
                d[i][j] = 0;
                for (int r = 0; r < k; r++) {
                    if (r != j + 1 && r != j - 1)//状态转移表达式要满足的条件
                    {
                        d[i][j] += d[i - 1][r];
                        d[i ][j] %= M;
                    }
                }
            }
        }
        int ans = 0;
        for (int j = 1; j < k; j++)//最后一位的情况不包括0
        {
            ans += d[l - 1][j];
            ans %= M;
        }
        System.out.println(ans);
    }

}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
如果一个自然数N的K进制表示中任意的相邻的两位都不是相邻的数字，那么我们就说这个数是K好数。
求L位K进制数中K好数的数目。例如K = 4，L = 2的时候，所有K好数为11、13、20、22、30、31、33 共7个。
由于这个数目很大，请你输出它对1000000007取模后的值。

输入格式
输入包含两个正整数，K和L。

输出格式
输出一个整数，表示答案对1000000007取模后的值。
样例输入
	4 2
样例输出
	7
数据规模与约定
	对于30%的数据，KL <= 106；
	对于50%的数据，K <= 16， L <= 10；
	对于100%的数据，1 <= K,L <= 100。
 */
