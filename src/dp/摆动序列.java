package dp;

import java.util.Scanner;

public class 摆动序列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m + 2][n + 2];
		for (int i = 1; i <= n; i++) {
			arr[1][i] = n - i + 1;
		}
		for (int i = 2; i <= m; i++) {
			if ((i & 1) == 1) {
				for (int j = n; j >= 1; j--)
					arr[i][j] = (arr[i - 1][j - 1] + arr[i][j + 1]) % 1000;
			} else {
				for (int j = 1; j <= n; j++)
					arr[i][j] = (arr[i - 1][j + 1] + arr[i][j - 1]) % 1000;
			}
		}
		if(m%2!=0){
			System.out.println(arr[m][1]);
		}else{
			System.out.println(arr[m][n]);
		}
	}

}