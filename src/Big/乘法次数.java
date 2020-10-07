package Big;

import java.util.Scanner;

public class 乘法次数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] result = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			while (arr[i] != 1) {
				if (arr[i] % 2 == 0) {
					temp++;
				} else {
					temp += 2;
				}
				arr[i] /= 2;
			}
			result[i] = temp;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
/*
 * 问题描述
　　给你一个非零整数，让你求这个数的n次方，每次相乘的结果可以在后面使用，求至少需要多少次乘。如24：2*2=22（第一次乘），22*22=24（第二次乘），所以最少共2次；
输入格式
　　第一行m表示有m(1<=m<=100)组测试数据；
　　每一组测试数据有一整数n（0<n<=100000000）;
输出格式
　　输出每组测试数据所需次数s;
样例输入
	3
	2
	3
	4
样例输出
	1
	2
	2
*/