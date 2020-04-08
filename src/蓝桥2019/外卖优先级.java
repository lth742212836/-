package 蓝桥2019;

import java.util.HashSet;
import java.util.Scanner;

public class 外卖优先级 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//多少家店
		int m=sc.nextInt();//m行
		int t=sc.nextInt();//时间
		HashSet<Integer> hs=new HashSet<Integer>();
		int[][] house=new int[n+1][2];//店ID和优先级
		for (int i = 1; i <=n; i++) {
			house[i][0]=i;
			house[i][1]=0;
		}
//		int[] first=new int[n+1];
		int[][] order=new int[m+1][2];
		for (int i = 1; i <=m; i++) {
			for (int j = 0; j < 2; j++) {
				order[i][j]=sc.nextInt();//输入订单
			}
		}
		
		for(int i=1;i<=t;i++){//每过一个时间
//			System.out.print(i+"时:	");
			for (int j = 1; j <= m; j++) {
				if(order[j][0]==i){
//					System.out.print("店ID为"+order[j][1]+"的优先级+2");
					house[	order[j][1]	]	[1]=house[	order[j][1]	]	[1]+2;
					for (int k = 1; k <= n; k++) {
						if(k!=house[	order[j][1]	]	[0]){
							
							if(house[k]	[1]!=0){
								house[k][1]--;
							}
							
						}
						if(house[k]	[1]>5){
//							System.out.print("	ID为"+house[k]	[0]+"的店加入了缓存	");
							hs.add(house[k]	[0]);//优先级大于5进去缓存
						}
						if(house[k]	[1]<=3){
							hs.remove(house[k]	[0]);
						}
						
					}
				}

			}
			
		}
		System.out.println(hs.size());
		
		
	}
}
