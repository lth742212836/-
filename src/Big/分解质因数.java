package Big;

import java.util.Scanner;

public class 分解质因数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(n);
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++) {//用平方根减少循环次数
                if(n%i==0){
                    System.out.print(i+" ");
                    n/=i;
                    i=1;
                }
            }

            if(n!=0){//for循环已经输出初始n的所有质因数但判断到sqrt(n)就结束了，差了最后的n所以输出n即可
                System.out.println(n);
            }
        }


    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　给定一个正整数n，尝试对其分解质因数
输入格式
　　仅一行，一个正整数，表示待分解的质因数
输出格式
　　仅一行，从小到大依次输出其质因数，相邻的数用空格隔开
样例输入
    100
样例输出
    2 2 5 5
数据规模和约定
　　n<=2147483647
 */
