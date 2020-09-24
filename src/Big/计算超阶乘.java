package Big;

import java.util.Scanner;

public class 计算超阶乘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = 1;//不能是int，会爆
        int count = 0;//0的个数
        for (int i = 0; i < n; i++) {
            sum = sum * (1 + i * k);
            while (sum % 10 == 0) {//只要末尾是0
                count++;
                sum /= 10;//去掉末尾0
            }
            //我们只关心末尾0的情况，对于>10万的末尾不含0的数，我们将其降到10万以下，防止sum爆long
            //也就是 100 1111 和 1111 对 count 的影响是一样的
            sum %= 100000;
        }
        System.out.println(count);
        System.out.println(sum % 10);
    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　计算1*(1+k)*(1+2*k)*(1+3*k)*...*(1+n*k-k)的末尾有多少个0，最后一位非0位是多少。
输入格式
　　输入的第一行包含两个整数n, k。
输出格式
　　输出两行，每行一个整数，分别表示末尾0的个数和最后一个非0位。
样例输入
15 2
样例输出
0
5
数据规模和约定
　　1<=k<=10，1<=n<=1000000。
 */