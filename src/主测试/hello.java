package 主测试;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		int[] all=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			 all[i] =Integer.valueOf(arr[i]);
		}
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}
	}
}
