package 主测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Text {
	static int max=0;
	static int min=0;
	static int[] pong;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line=sc.nextLine().split(" ");
		pong=new int[line.length];
		n=pong.length;
		for (int i = 0; i < line.length; i++) {
			pong[i] =Integer.valueOf(line[i]);
		}
		int[] arr=new int[n];
		Arrays.fill(arr, 0);
		
		dfs(0,arr);
		System.out.println(max);
		System.out.println(min);
	}

	public static void dfs(int k,int[] arr) {
		if(k==n){
			ArrayList<Integer> list=new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=0){
					list.add(arr[i]);
				}
			}
			boolean flagMa=false;
			boolean flagMi=false;
			for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i)<list.get(i+1)){
					flagMa=true;
				}
			}
			for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i)>list.get(i+1)){
					flagMi=true;
				}
			}
			if(flagMa==false){
				if(max<list.size()){
					max=list.size();
				}
			}
			if(flagMi==false){
				if(min<list.size()){
					min=list.size();
				}
			}
			
			return;
		}
		dfs(k+1,arr);
		arr[k]=pong[k]; 
		dfs(k+1,arr);
		arr[k]=0;
		
	}
}
