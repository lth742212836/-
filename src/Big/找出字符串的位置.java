package Big;

import java.util.Scanner;


public class 找出字符串的位置 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String all="abfaefcbancb";
		char[] w=all.toCharArray();//总的字符数组
		
//		String init=sc.next();
//		char[] p=init.toCharArray();//输入的字符数组
		char[] p={'a','b','c'};
		
	}
	static void solve(char[] w){
		int min=5;
		int j=-1;
		for(int i=0;i<w.length;i++){
			char c=w[i];
			if(		w[i]=='a' || w[i]=='b' || w[i]=='c'	){
				
				if(j==-1){
					j=i+1;
				}
				while(j<w.length){
					char c2=w[j];
					if(		w[i]=='a' || w[i]=='b' || w[i]=='c'		&& contains(w,i,j)){
						if(j-i+1<min){
							min=j-i+1;
						}
						break;
					}
					j++;
				}
				
			}
		}
		
	}
	static boolean contains(char[]w,int begin,int end){
		int s1=0;
		int s2=0;
		int s3=0;
		for(int i=begin;i<=end;i++){
			if(w[i]=='a'){
				s1++;
			}
			if(w[i]=='b'){
				s2++;		
			}
			if(w[i]=='c'){
				s3++;
			}
		}
		if(s1==1 && s2==1 && s3==1){
			return true;
		}else{
			return false;
		}
		
	}
}

