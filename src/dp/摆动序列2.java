package dp;

import java.util.Scanner;

public class 摆动序列2 {
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
}
