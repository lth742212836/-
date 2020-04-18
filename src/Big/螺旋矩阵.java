package Big;

import java.util.Scanner;

public class 螺旋矩阵 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
//		int r=sc.nextInt();
//		int c=sc.nextInt();
		
		int[][] arr=new int[n][m];
		int temp=1;
		int i=0;
		int j=0;
		
		int up=0;
		int down=n-1;
		int left=0;
		int right=m-1;
		
		while(true){
			while(true){//1
				arr[i][j]=temp;
				if(j==right){
					break;
				}
				j++;
				temp++;
			}
			up++;
			if(up>down){
				break;
			}
			
			
			while(true){//2
				arr[i][j]=temp;
				if(i==down){
					break;
				}
				i++;
				temp++;
			}
			right--;
			if(right<left){
				break;
			}
			
			
			while(true){//3
				arr[i][j]=temp;
				if(j==left){
					break;
				}
				j--;
				temp++;
			}
			left++;
			if(left>right){
				break;
			}
			
			
			while(true){//4
				arr[i][j]=temp;
				if(i==up){
					break;
				}
				i--;
				temp++;
			}
			down--;
			if(up>down){
				break;
			}
			
			
		}
//		System.out.println(arr[r-1][c-1]);
		for (int p = 0; p < arr.length; p++) {
			for (int k = 0; k < arr[p].length; k++) {
				System.out.print(arr[p][k]+"  ");
			}System.out.println();
		}
	}
	/*
	 * 问题描述
　　对于一个 n 行 m 列的表格，我们可以使用螺旋的方式给表格依次填上正整数，我们称填好的表格为一个螺旋矩阵。
　　例如，一个 4 行 5 列的螺旋矩阵如下：
　　1 2 3 4 5
　　14 15 16 17 6
　　13 20 19 18 7
　　12 11 10 9 8
输入格式
　　输入的第一行包含两个整数 n, m，分别表示螺旋矩阵的行数和列数。
　　第二行包含两个整数 r, c，表示要求的行号和列号。
输出格式
　　输出一个整数，表示螺旋矩阵中第 r 行第 c 列的元素的值。
样例输入
4 5
2 2
样例输出
15
	 */
}