package Big;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 最小乘积 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int[] result = new int[t];//结果数组

            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] one = new int[n];
                Integer[] two = new Integer[n];

                for (int j = 0; j < n; j++) {
                    one[j] = sc.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    two[j] = sc.nextInt();
                }

                //给输入的数组排序
                Arrays.sort(one);//升序
                Arrays.sort(two, Collections.reverseOrder());//降序

                //计算
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += one[j] * two[j];
                }

                result[i] = sum;
            }

            for (int i = 0; i < t; i++) {
                System.out.println(result[i]);
            }
    }

}
/*
问题描述
　　给两组数，各n个。
　　请调整每组数的排列顺序，使得两组数据相同下标元素对应相乘，然后相加的和最小。要求程序输出这个最小值。
　　例如两组数分别为:1 3　　-5和-2 4 1

　　那么对应乘积取和的最小值应为：
　　(-5) * 4 + 3 * (-2) + 1 * 1 = -25
输入格式
　　第一个行一个数T表示数据组数。后面每组数据，先读入一个n，接下来两行每行n个数，每个数的绝对值小于等于1000。
　　n<=8,T<=1000
输出格式
　　一个数表示答案。
样例输入
    2
    3
    1 3 -5
    -2 4 1
    5
    1 2 3 4 5
    1 0 1 0 1
样例输出
    -25
    6

 */