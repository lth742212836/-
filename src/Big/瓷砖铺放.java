package Big;

import java.util.Scanner;

public class 瓷砖铺放 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		if(n==1){
			System.out.println(1);
		}else{
			arr[1]=1;
			arr[2]=2;
			for (int i = 3; i < arr.length; i++) {
				arr[i]=arr[i-1]+arr[i-2];
			}
			System.out.println(arr[arr.length-1]);
		}
		
		
	}
}