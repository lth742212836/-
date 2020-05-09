package 与位算;

import java.util.Scanner;

public class 二进制数数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        long sum = 0;
        for (int i = l; i <= r; i++) {
            int temp=i;
            while (temp!=0){
                if((temp&1)==1){
                    sum++;
                }
                temp=temp>>1;
            }
        }
        System.out.println(sum);
    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　给定L,R。统计[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
　　如5的二进制为101，包含2个“1”。
输入格式
　　第一行包含2个数L,R
输出格式
　　一个数S，表示[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
样例输入
2 3
样例输出
3
数据规模和约定
　　L<=R<=100000;
 */
