package Big;

import java.util.Scanner;

public class 质数2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        int[] arr=new int[999];
        for (int i = 2; i <x; i++) {

            //判断是否为质数
            int prime=0;//0表示是质数
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    prime=1;
                    break;
                }
            }

            //进行统计
            if(prime==0){
                arr[count]=i;
                count++;
            }

        }
        //输出
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　给定一个正整数N，请你输出N以内（不包含N）的质数以及质数的个数。
输入格式
　　输入一行，包含一个正整数N。
输出格式
　　共两行。
　　第1行包含一个整数，表示N以内质数的个数。
　　第2行包含若干个素数，每两个素数之间用一个空格隔开，素数从小到大输出。
样例输入
    10
样例输出
    4
    2 3 5 7
数据规模和约定
　　N<=1000
 */