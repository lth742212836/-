package Big;

import java.util.Scanner;

public class 最小公倍数 {
    //两个数的公倍数==a*b/最大公约数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        lcm(a, b);

    }

    private static void lcm(int a, int b) {
        int min = a;
        int p = 1;
        if (min > b)
            min = b;
        for (int i = 2; i < min; i++) {
            if (a % i == 0 && b % i == 0) {
                p = i;
                break;
            }
        }
        int q = (a * b) / p;
        System.out.print(q);
    }
}
/*
    问题描述
    　　编写一函数lcm，求两个正整数的最小公倍数。
    样例输入
    一个满足题目要求的输入范例。
    例：
        3 5
    样例输出
    与上面的样例输入对应的输出。
    例：

    数据规模和约定
    　　输入数据中每一个数的范围。
    　　例：两个数都小于65536。
 */
