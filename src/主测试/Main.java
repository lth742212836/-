package 主测试;

import java.util.Scanner;

public class Main {
	static int ans =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 2; i <=n; i++) {
			dfs(m,n,1,i);
		}
		System.out.println(ans);
	}

	/**
	 * 第k位为i
	 */
	private static void dfs(int m, int n, int k,int i) {
		if(k==m){
			ans++;
			return;
		}
		if(k%2==1){//i在奇数位，设置偶数位
			for (int j = i-1; j >0; j--) {
				dfs(m,n,k+1,j);
			}
		}else {
			for (int j = i+1; j <=n; j++) {
				dfs(m,n,k+1,j);
			}
		}
	}
	/*
	 * 问题描述

如果一个序列的奇数项都比前一项大，偶数项都比前一项小，则称为一个摆动序列。即 a[2i]<a[2i-1], a[2i+1]>a[2i]。
　　小明想知道，长度为 m，每个数都是 1 到 n 之间的正整数的摆动序列一共有多少个。

输入格式

输入一行包含两个整数 m，n。

输出格式

输出一个整数，表示答案。答案可能很大，请输出答案除以10000的余数。

样例输入

3 4

样例输出

14

样例说明

以下是符合要求的摆动序列：
　　2 1 2
　　2 1 3
　　2 1 4
　　3 1 2
　　3 1 3
　　3 1 4
　　3 2 3
　　3 2 4
　　4 1 2
　　4 1 3
　　4 1 4
　　4 2 3
　　4 2 4
　　4 3 4

评测用例规模与约定
————————————————
版权声明：本文为CSDN博主「南     墙」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/a1439775520/article/details/105493031
	 */
}
