package 主测试;

import java.util.Scanner;
import java.util.Stack;

public class hello {
    public static void main(String[] args) {
		Stack<String> sta=new Stack();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sta.push(str);
		System.out.println(sta.size());
		System.out.println(sta);
    }
}
