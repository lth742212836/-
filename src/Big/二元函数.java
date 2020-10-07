package Big;

import java.util.Scanner;
import java.util.Stack;

public class 二元函数 {
    public static int a;
    public static int b;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        /*
        不用String str = input.nextLine();的原因
        nextLine的回车会被push到sta中
        如：
        Stack<String> sta=new Stack();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sta.push(str);
		System.out.println(sta.size());
		System.out.println(sta);
		输入：//输入一个回车

		会输出：
            1
            []
        str中会包含回车
         */
        String str = input.next();

        char chars[] = str.toCharArray();
        Stack<Integer> stack = new Stack<>();//借助栈来保存依次找到的数字字符
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-') {
                flag = false;
            } else if (Character.isDigit(chars[i])) {//Character.isDigit()判断字符是否为数字
                int num = 0;
                for (; i < chars.length && Character.isDigit(chars[i]); i++) {
                    num = num * 10 + Integer.parseInt(String.valueOf(chars[i]));//当数字字符连续时，将数字字符拼接成一个完整的数字
                }
                i--;
                if (flag) {
                    stack.push(num);//将num进栈
                } else {
                    stack.push(num * (-1));//将负num进栈
                    flag = true;//将标志位置为true
                }
            } else if (chars[i] == ')') {
                int y = stack.pop();
                int x = stack.pop();
                int r = counts(x, y);
                stack.push(r);
            }

        }
        // f(f(10,20),f(30,40))
        System.out.println(stack.pop());
    }

    //a*x+b*y的值
    public static int counts(int x, int y) {
        return a * x + b * y;
    }
}
/*
问题描述
　　令二元函数f(x,y)=ax+by，a和b为整数，求一个表达式S的值。
　　只有满足以下要求的表达式才是合法的：
　　1.任意整数x是一个合法的表达式；
　　2.如果A和B都是合法的表达式，则f(A,B)也是一个合法的表达式。
输入格式
　　第一行两个数a和b；
　　第二行一个字符串S表示要求的表达式。
输出格式
　　一行一个数表示表达式S的值。
样例输入
1 2
f(1,f(1,-1))
样例输出
-1
 */