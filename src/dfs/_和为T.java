package dfs;

import java.util.Scanner;

public class _和为T {
	static int[] a=new int[30];
	static int[] b=new int[30];
	static int T;
	static int n;
	static int sum=0;
	public static void f(long t,int pos,int i )//i为起始遍历的索引位置 ，pos为数组中符合答案的元素个数 
	 {
		if(t==T&&pos!=0&&i<1) 
		{ //终止条件 注意全部遍历完再进行判断(防止 -1 1 -2 2 3 -3的特例) 并且 不能不选
			sum++;//sum为答案的个数 
			for(int j=pos-1; j>=0; j--){
				//倒着遍历输出
				System.out.print(b[j]+" ");
			}
			System.out.println();
		} 
		else 
		{
			if(i<1){
				return ;//遍历到数组第一项还未满足t==T;则返回
			}
				
			f(t,pos,i-1);
			b[pos]=a[i];
			f(t+a[i],pos+1,i-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=n; i++)
			a[i]=sc.nextInt();
		T=sc.nextInt();
		f(0,0,n);
		System.out.println(sum);
	}
	

}