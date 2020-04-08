package Big;

import java.util.Scanner;
//k好数 dp
public class k好数 {
	
	final static int maxn=100;
	final static int M=1000000007;
	static int d[][]=new int[maxn+5][maxn+5];//d[i][j]表示将i位置的值置为j时的k好数的个数
	
    //由分析，其状态转移方程从最低+1位开始，d[i][j]= ∑d[i-1][r](r!=j+1&&r!=j-1&&0<=r<=k-1)            
//最高位j！=0，需特殊处理
	//其初始条件为d[0][j]=1;不受约束
	public static void main(String[] args) {
		Scanner cin= new Scanner(System.in);
		int k,l;
		k=cin.nextInt();
		l=cin.nextInt();
 
		for(int j=0;j<k;j++) d[0][j]=1;
		for(int i=1;i<l;i++)//i=0已经初始化过了
		{
			for(int j=0;j<k;j++)//求第i个位置放置每一个值时d[i][j]的大小;
			{
				d[i][j]=0;
				for(int r=0;r<k;r++)
				{
					if(r!=j+1&&r!=j-1)//状态转移表达式要满足的条件
					{
						d[i][j]+=d[i-1][r];
						d[i][j]%=M;
					}
				}
			}
		}
		int ans=0;
		for(int	j=1;j<k;j++)//最后一位的情况不包括0
		{
			ans+=d[l-1][j];
			ans%=M;
		}
		System.out.println(ans);
	}
 
}
