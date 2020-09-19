package Big;

import java.util.Scanner;
/*
    ψ（10）=10×（1－1/2）×（1－1/5）=4；
    ψ（30）=30×（1－1/2）×（1－1/3）×（1－1/5）=8；
    ψ（49）=49×（1－1/7）=42
 */
public class 欧拉函数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = n;
        for (int i = 2; i * i <= n; i++) {
            //优化 O(sqrt(n)) 不过要在出口 if(n>1)ans/n*(n-1) O(n)不用
            if (n % i == 0) {
                ans = ans / i * (i - 1);//n*(1-(1/p))转化为n/p*(p-1)
                while (n % i == 0)
                    n /= i;
            }
        }
        if (n > 1)
            System.out.println(ans / n * (n - 1));
        else
            System.out.println(ans);
    }

}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　老师出了一道难题，小酱不会做，请你编个程序帮帮他，奖金一瓶酱油：
　　从1—n中有多少个数与n互质?
　　|||||╭══╮ ┌═════┐
　　╭╯让路║═║酱油专用车║
　　╰⊙═⊙╯ └══⊙═⊙═(坑爹的题面格式化，害得我用‘|’来代替空格，复制到记事本上看就变成正版的了)
输入格式
　　输入共一行，表示一个整数n。
输出格式
　　输出共一行，表示从1—n中与n互质的数的个数。
样例输入
    30
样例输出
    8
数据规模和约定
　　60%的数据≤10^6
　　100%的数据≤2*10^9
 */
