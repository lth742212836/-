package Big;

import java.util.Scanner;

public class 动态数组使用 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        int sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum+" "+sum/n);
    }
}
/*
资源限制
时间限制：1.0s   内存限制：512.0MB
从键盘读入n个整数，使用动态数组存储所读入的整数，并计算它们的和与平均值分别输出。要求尽可能使用函数实现程序代码。平均值为小数的只保留其整数部分。
样例输入:
    5
    3 4 0 0 2
样例输出:
    9  1
样例输入:
    7
    3 2 7 5 2 9 1
样例输出:
    29  4
 */