package Big;

import java.math.BigInteger;
import java.util.Scanner;

public class 高精度乘法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        BigInteger one=new BigInteger(a);
        BigInteger two=new BigInteger(b);
        System.out.println(one.multiply(two));

    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
计算机真是最傻的东西；他都不能计算大于10^65-1的a*b，请你帮这个“最傻”的东西过关，否则它就真的只认识1和0了。
输入格式
共两行；
第一行输入一个整数a；
第一行输入一个整数b。
输出格式
　　共一行，一个表示a*b的整数。
样例输入
    2147483647
    2147483647
样例输出
    4611686014132420609
数据规模和约定
　　10^65-1<a,b<10^201-1
 */