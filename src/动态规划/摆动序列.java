package 动态规划;

import java.util.Scanner;

public class 摆动序列 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(solution(n));
	}
/*
 * dp[i][j]表示K = i时由j个数组成的摆动序列有多少种
 */
	private static int solution(int n) {
		int res = 0;
		int[][] dp = new int[n + 1][n + 1];
		for (int i = 2; i < dp.length; i++) {  //两个数无论怎么组合都是摆动序列，所以即求A（i，2）
			dp[i][2] = i * (i - 1);
			dp[i][i] = 2;
		}
		for (int i = 3; i < dp.length; i++) {
			for (int j = 3; j < i; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
		for(int i = 2; i < dp[n].length; i++) {
			res+= dp[n][i];
		}
		return res;
	}
	
}