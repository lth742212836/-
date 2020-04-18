package Big;

import java.util.Scanner;

public class 关联矩阵 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for (int i = 0; i < m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[a-1][i]=1;
			arr[b-1][i]=-1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}