package Big;

import java.util.Scanner;


public class 寻找字符串位置暴力 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p=sc.nextLine();
		String s=sc.nextLine();
		int result=query(p, s);
		System.out.println(result);
	}
	static int query(String p,String s){
		int i=0;//p
		int j=0;//s		源串
		int sc=j;
		while(sc<s.length()){
			if(p.charAt(i)==s.charAt(sc)){
				sc++;
				i++;
				if(i==p.length()){
					return j;
				}
			}else{
				j++;
				sc=j;
				i=0;
			}
		}
		return -1;
	}
}

