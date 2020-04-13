package dfs;

import java.util.ArrayList;
import java.util.Scanner;

/*
给定整数序列a1,a2,...,an,判断是否可以从中选出若干数,使它们的和恰好为k.

    1≤n≤20

    -10^8≤ai≤10^8

    -10^8≤k≤10^8

样例:

输入

    n=4
    a={1,2,4,7}
    k=13
输出:

    Yes (13 = 2 + 4 + 7)

*/
public class 部分和 {
	static int kk;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr=new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    int k = sc.nextInt();//13
	    kk=k;
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    dfs(arr,0,0,list);
	}
	public static void dfs(int[] arr,int sum,int cur,ArrayList<Integer> list){
		if(sum==kk){
			System.out.print("Yes (" + kk + " = ");
			int size = list.size();
		      for (int i = 0; i < size; i++) {
		        System.out.print(list.get(i) + (i == size - 1 ? "" : " + "));
		      }
		      System.out.println(")");
		      System.exit(0);
		}
		if(sum<0 || cur>arr.length-1){
			return;
		}
		dfs(arr,sum,cur+1,list);
		
		list.add(arr[cur]);
		int index = list.size() - 1;
		
		dfs(arr,sum+arr[cur],cur+1,list);
		list.remove(index);//回溯
		
	}

}
