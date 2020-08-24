package Big;

import java.util.Arrays;
import java.util.Scanner;

public class 排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 2; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
资源限制
时间限制：1.0s   内存限制：512.0MB
问题描述
　　编写一个程序，输入3个整数，然后程序将对这三个整数按照从大到小进行排列。
　　输入格式：输入只有一行，即三个整数，中间用空格隔开。
　　输出格式：输出只有一行，即排序后的结果。
　　输入输出样例
样例输入
    9 2 30
样例输出
    30 9 2
 */