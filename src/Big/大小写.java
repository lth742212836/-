package Big;

import java.util.Scanner;

public class 大小写 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] arr=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<97){
				arr[i]=(char) (arr[i]+32);
			}else{
				arr[i]=(char) (arr[i]-32);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}

