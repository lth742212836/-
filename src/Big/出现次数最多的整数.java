package Big;

import java.util.*;

public class 出现次数最多的整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
//            System.out.println();
            return;
        }

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        //将出现的数放入list中
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        //将出现的数与对应的次数放入map中
        for (int i = 0; i < list.size(); i++) {
            int num = 0;
            for (int j = 0; j < n; j++) {
                if (list.get(i) == arr[j]) {
                    num++;
                }
            }
            map.put(list.get(i), num);
        }

        Set<Integer> set = map.keySet();
        int max = 0;//最大次数
        int len = 0;//下标
        for (int i : set) {
            if (map.get(i) > max) {
                max = map.get(i);
                len = i;
            }
        }
        System.out.println(len);

    }
}
/*
资源限制
时间限制：1.0s   内存限制：512.0MB
　　﻿问题描述
　　编写一个程序，读入一组整数，这组整数是按照从小到大的顺序排列的，它们的个数N也是由用户输入的，最多不会超过20。然后程序将对这个数组进行统计，把出现次数最多的那个数组元素值打印出来。如果有两个元素值出现的次数相同，即并列第一，那么只打印比较小的那个值。
　　输入格式：第一行是一个整数N，N £ 20；接下来有N行，每一行表示一个整数，并且按照从小到大的顺序排列。
　　输出格式：输出只有一行，即出现次数最多的那个元素值。
输入输出样例
样例输入
    5
    100
    150
    150
    200
    250
样例输出
    150
 */
