package dp;

import java.util.Scanner;

public class 最长上升子序列 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] arr = new int[10002];//arr数组表示输入的序列
		int[] dp = new int[10002];//dp数组中存放上升序列的长度，dp[i]表示以arr[i]结尾的子序列的最大长度
		for(int i = 1;i <= n;i++) {//输入序列
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		int result = -1;//记录dp中最大的值
		
		for(int i = 1;i <= n;i++) {//按顺序计算dp[i]的值
			dp[i] = 1;//假设该子序列中只有arr[i]，故长度为1，即其自身成为一个子序列
			for(int j = 1;j < i;j++) {
//如果在i之前有比arr[i]小的数(arr[j])，并且把该数(arr[i])放到以arr[j]结尾的子序列末尾后，
//其长度比当前以arr[i]结尾的子序列长度要长
				if(arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;//把arr[i]放到以arr[j]结尾的子序列之后，原来的长度＋1
				}
			}
			result = Math.max(result, dp[i]);//找出在dp数组中最大的一个，即子序列长度最长的一个
		}
		System.out.println(result);
	}


}
