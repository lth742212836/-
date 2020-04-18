package Big;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 石子游戏 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> list=new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		long sum=0;
		while(list.size()>1){
			long product=(  list.get(list.size()-1)+1  ) * (  list.get(list.size()-2)+1  );
			long temp=(  list.get(list.size()-1) ) + (  list.get(list.size()-2)  );
			
			sum+=product;
			list.remove(list.size()-1);
			list.remove(list.size()-1);
			list.add(temp);
		}
		System.out.println(sum);
	}
/*
 * 问题描述
　　石子游戏的规则如下：
　　地上有n堆石子，每次操作可选取两堆石子（石子个数分别为x和y）并将它们合并，操作的得分记为(x+1)×(y+1)，对地上的石子堆进行操作直到只剩下一堆石子时停止游戏。
　　请问在整个游戏过程中操作的总得分的最大值是多少？
输入格式
　　输入数据的第一行为整数n，表示地上的石子堆数；第二行至第n+1行是每堆石子的个数。
输出格式
　　程序输出一行，为游戏总得分的最大值。
样例输入
10
5105
19400
27309
19892
27814
25129
19272
12517
25419
4053
样例输出
15212676150
 */
}