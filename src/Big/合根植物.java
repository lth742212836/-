package Big;
import java.util.Scanner;

public class 合根植物 { 
	
	static int[] s=null;
	
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		s=new int[m*n+1];
		int x=sc.nextInt();
		for(int i=0;i<x;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int max=Math.max(a, b);
			int min=Math.min(a, b);
			if(s[max]==0 && s[min]==0){
				s[min]=max;
			}else{
				int ma=findRoot(max);
				int mi=findRoot(min);
				if(ma!=mi){
					max=Math.max(ma, mi);
					min=Math.min(ma, mi);
					s[min]=max;
				}
				
			}
		}
		int cou=0;
		for(int i=1;i<s.length;i++){
			if(s[i]==0){
				cou++;
			}
		}
		System.out.println(cou);
		
	}
	static int findRoot(int num) {
		if(s[num]!=0) return findRoot(s[num]);
		return num;
	}
}
