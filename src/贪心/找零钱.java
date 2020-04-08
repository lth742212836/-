package 贪心;

import java.util.Scanner;

public class 找零钱 {
	static int a=0;
	static int b=0;
	static int c=0;
	static boolean resu=true;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int x=0;
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
			if(arr[i]==25){
				x++;
			}
		}
		if(x!=0){
			run(arr);
		}else{
			System.out.println("NO");
		}
		
	}
	public static void run(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==25){
				a++;
			}
			if(arr[i]==50){
				if(a==0){
					resu=false;
					break;
				}
				a--;
				b++;
			}
			if(arr[i]==100){
				if(a>=3 || a>=1 && b>=1){
					b--;
					a--;
				}else{
					resu=false;
					break;
				}
			}
		}
		
		if(resu==false){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
}