package Big;

import java.util.Scanner;

public class 大等于n的最小完全平方数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double j=Math.sqrt(n);
        long ans=0;
        if(n<=0){
            ans=0;
        }else {
            if((long)j*(long)j==n){
                ans=(long)j;
            }else {
                ans=(long)(j+1);
            }
        }
        System.out.println(ans*ans);
    }
}
/*
问题描述
　　输出大等于n的最小的完全平方数。
　　若一个数能表示成某个自然数的平方的形式，则称这个数为完全平方数
　　Tips：注意数据范围
输入格式
　　一个整数n
输出格式
　　大等于n的最小的完全平方数
样例输入
    71711
样例输出
    71824
数据规模和约定
　　n是32位有符号整数
 */