package 主测试;

import java.util.Scanner;
import java.util.Stack;

public class Text {
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        String str = sc.next();
        char[] arr = str.toCharArray();

        boolean flag = true;
        Stack<Integer> sta = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '-') {
                flag = false;
            } else {
                if (Character.isDigit(arr[i])) {
                    int num = 0;
                    for (; i < arr.length && Character.isDigit(arr[i]); i++) {
                        num = num * 10 + Integer.parseInt(String.valueOf(arr[i]));
                    }
                    i--;
                    if (flag) {
                        sta.push(num);//将num进栈
                    } else {
                        sta.push(num * (-1));//将负num进栈
                        flag = true;//将标志位置为true
                    }
                } else {
                    if (arr[i] == ')') {
                        int y = sta.pop();
                        int x = sta.pop();
                        int r = counts(x, y);
                        sta.push(r);
                    }
                }

            }
        }
        System.out.println(sta.pop());

    }

    public static int counts(int x, int y) {
        return a * x + b * y;
    }

}
