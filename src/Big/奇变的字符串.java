package Big;

import java.util.Scanner;

public class 奇变的字符串 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr=sc.nextLine();
		char[] temp = arr.toCharArray();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < temp.length; i++) {
			if((i&1)==1){
				sb.append(temp[i]);
			}
		}
		sb.reverse();
		int j=0;
		for (int i = 0; i < temp.length; i++) {
			if((i&1)==1){
				temp[i]=sb.charAt(j);
				j++;
			}
		}
		System.out.println(temp);
	}
}