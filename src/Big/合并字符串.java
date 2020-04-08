package Big;

import java.util.Scanner;

public class 合并字符串 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		
		char[] arr1=a.toCharArray();
		char[] arr2=b.toCharArray();
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
	}

}

