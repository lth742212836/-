package Big;

import java.util.Scanner;

public class 友好数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		int sum1=0;
		for (int i = 1; i < a; i++) {
			if(a%i==0){
				sum1+=i;
			}
		}
		int sum2=0;
		for (int i = 1; i < b; i++) {
			if(b%i==0){
				sum2+=i;
			}
		}
		if(sum1==b && sum2==a){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
/*
 * 问题描述
　　有两个整数，如果每个整数的约数和（除了它本身以外）等于对方，我们就称这对数是友好的。例如：
　　9的约数和有：1+3=4
　　4的约数和有：1+2=3
　　所以9和4不是友好的。
　　220的约数和有：1 2 4 5 10 11 20 22 44 55 110=284
　　284的约数和有：1 2 4 71 142=220
　　所以220和284是友好的。
　　编写程序，判断两个数是否是友好数。
输入格式
　　一行，两个整数，由空格分隔
输出格式
　　如果是友好数，输出"yes"，否则输出"no"，注意不包含引号。
样例输入
	220 284
样例输出
	yes
数据规模和约定
　　两个整数都小于10000
 */
}
