package Big;

import java.util.Scanner;

public class 最大获利 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		long[][] waiter = new long[n][m];
		long[][] god = new long[n][m];
		long[][] money = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				waiter[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				god[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				money[i][j] = sc.nextInt();
			}
		}
		long max = 0;
		long all = 0;
		for (int i = 0; i < n; i++) {
			max = 0;
			for (int j = 0; j < m; j++) {
				long sum = (Math.min(waiter[i][j], god[i][j])) * money[i][j];
				if (max < sum) {
					max = sum;
				}
			}
			all += max;

		}
		System.out.println(all);

	}
/*
 * 题描述
　　Chakra是一位年轻有为的企业家，最近他在进军餐饮行业。他在各地开拓市场，共买下了N个饭店。在初期的市场调研中，他将一天划分为M个时间段，并且知道第i个饭店在第j个时间段内，会有Aij位服务员当值和Bij位客户光临。他还分析了不同饭店不同时间段客户的需求，得到第i个饭店在第j个时间段内，平均每位客户消费Cij元。为了创设品牌形象，Chakra决定每个饭店每天只选择一个时间段营业，每个服务员至多接待一位顾客（若顾客数多于服务员数，超过部分的顾客当天就无法在该店消费了）。
　　企业家的目的终究还是获利。请你安排营业时间，并告诉Chakra每天消费总额最多为多少。
输入格式
　　第一行两个整数，N、M。
　　第二行开始依次给出三个矩阵A(N*M)、B(N*M)、C(N*M)。
输出格式
　　一行一个整数，最大消费总额。
样例输入
2 3
1 2 3
3 2 1
3 2 1
1 2 3
4 5 2
3 1 6
样例输出
16
数据规模和约定
　　1 <= M,N <= 100
　　1 <= Aij, Bij <= 5000
　　0 <= Cij <= 10^9
 */
}