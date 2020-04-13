package dfs;

import java.util.Scanner;

public class 冪方分解 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dfs(n);
	}
	public static void dfs(int n){
		if(n==1){
			System.out.print("2(0)");
			return;
		}
		if(n==2){
			System.out.print("2");
			return;
		}
		int temp=0;
		for (int i = 0; i < 15; i++) {
			if(n>=Math.pow(2, i) && n<Math.pow(2, i+1)){
				temp=i;
				break;
			}
		}
		if(temp==0){
			System.out.print("2(0)");
		}else{
			if(temp==1){
				System.out.print("2");
			}else{
				System.out.print("2(");
				dfs(temp);
				
				System.out.print(")");
			}
		}
		if(	(n-(int)Math.pow(2, temp))!=0 	){
			System.out.print("+");
			dfs(n-(int)Math.pow(2, temp));
		}
		
		
	}
}