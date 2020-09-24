package Big;

import java.math.BigInteger;
import java.util.Scanner;

public class 高精度减法 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();

        BigInteger one=new BigInteger(a);
        BigInteger two=new BigInteger(b);
        System.out.println(one.subtract(two));


    }
}
/*
问题描述
　　高精度减法
输入格式
　　两行，表示两个非负整数a、b，且有a > b。
输出格式
　　一行，表示a与b的差
样例输入
    1234567890987654321
    9999
样例输出
    1234567890987644322
 */
