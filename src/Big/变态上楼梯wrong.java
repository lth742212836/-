package Big;

import java.util.Scanner;
//变态上楼梯，不限一次走的阶数.方案为2的n-1次方
public class 变态上楼梯wrong {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pow = (int)Math.pow(2, n-1);
		System.out.println(pow);
	}
}

