package Big;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Node{
	int left;
	int right;
	int val;
	public Node(int left, int right, int val) {
		super();
		this.left = left;
		this.right = right;
		this.val = val;
	}
	@Override
	public String toString() {
		return "Node [left=" + left + ", right=" + right + ", val=" + val + "]";
	}
	
	
}
public class 不重叠的线段 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Node p[]=new Node[n];
		for(int i=0;i<n;i++) {
			int left=sc.nextInt();
			int right=sc.nextInt();
			int val=sc.nextInt();
			p[i]=new Node(left, right, val);
		}
		
		Arrays.sort(p, new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				if(o1.right>o2.right)
					return 1;
				else if(o1.right<o2.right)
					return -1;
				else
				    return 0;
			}
		});
		
//		for(int i=0;i<n;i++)
//			System.out.println(p[i].toString());
		
		int dp[]=new int[n];
		
		if(n>0)
			dp[0]=p[0].val;
		for(int i=1;i<n;i++) {
			dp[i]=p[i].val;
			for(int j=i-1;j>=0;j--) {
				if(p[i].left<=p[j].right)
					dp[i]=Math.max(dp[i],dp[j]);
				else if(p[i].left>p[j].right) {
					dp[i]=Math.max(dp[i], dp[j]+p[i].val);
				}
			}
		}
		System.out.println(dp[n-1]);
	}

}
/*

		===		此解释与代码逻辑相似，但不对应	====
这道题是用动态规划算法。
假设一维数组dp[i],表示的为在i点前（包括i）的最大价值。我们先对线段按照右端的大小进行排序。
然后依次对排完序的每一条线段进行分析，对于每条线段右端最大价值有两种情况：
情况1：当一条线段最左端，小于前面线段的最右端。则价值的最大值=前面线段的最右端的价值+这条线段的权值。
dp[p[i].right]=max(dp[p[i].right],dp[p[j].right]+p[i].value);
情况2：当一条线段最左端，大于前面线段的最右端。最大值=前面线段的最右端的价值，因为不能重合所以不加这条线段的权值。dp[p[i].right]=max(dp[p[i].right],dp[p[j].right]);

//这里注意：如果找到最前面的一条边都还没找到，那当前线段右端的最大价值=其前一个线段最右端的最大价值或其本身价值的最大值。dp[p[i].right]=max(p[i].value,dp[p[i-1].right]);

 */

/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　给出在数轴上的n条线段的左右端点的坐标l,r和它们的价值v，请你选出若干条没有公共点的线段(端点重合也算有公共点)，使得它们的价值和最大，输出最大价值和。
输入格式
　　第一行一个正整数n。

　　接下来n行，每行三个整数l,r,v分别表示一条线段的左端点，右端点和价值。l<r，v>0。
输出格式
　　输出一个整数表示最大价值和。
样例输入
	4
	1 3 4
	3 5 7
	5 7 3
	2 6 8
样例输出
	8
数据规模和约定
　　n<=2000
　　l,r,v<=1000000
 */