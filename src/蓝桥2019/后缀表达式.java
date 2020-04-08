package 蓝桥2019;

import java.util.Arrays;
import java.util.Scanner;

public class 后缀表达式 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n+m+1];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		Arrays.sort(arr);
		for (int i = n+m; i >=0; i--) {
			if(i>n-1){
				sum=sum+arr[i];
			}else{
				sum=sum-arr[i];
			}
		}
		System.out.println(sum);
	}
}
