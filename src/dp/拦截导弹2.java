package dp;

import java.util.Scanner;

public class 拦截导弹2 {
	static int[] MaxLength, // 最大拦截数
			height, // 导弹的高度
			MaxCount; // 最大上升子序列
	static int max1, max2;

	public static void LTS(int k) {
		for (int i = 0; i < k; i++) {
			MaxLength[i] = 1;
			MaxCount[i] = 1;
			for (int j = 0; j < i; j++) {
				if (height[i] <= height[j]) {
					MaxLength[i] = Math.max(MaxLength[i], MaxLength[j] + 1);
				} else {
					MaxCount[i] = Math.max(MaxCount[i], MaxCount[j] + 1);
				}
			}
			max1 = Math.max(max1, MaxLength[i]);
			max2 = Math.max(max2, MaxCount[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		MaxLength = new int[n];
		MaxCount = new int[n];
		height = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = scan.nextInt();
		}
		LTS(n);
		System.out.println(max1);
		System.out.println(max2);
	}
}