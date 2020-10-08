package Big;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class 出现次数最多数2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println();
            return;
        }
        int arr[] = new int[n];
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {//用list集合存放输入的数字
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        //遍历List集合，统计出现的次数，并和对应的数字放在Map集合里
        for (int i = 0; i < list.size(); i++) {
            int number = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == list.get(i)) {
                    number++;
                }
            }
            // k为 数字  v为次数
            map.put(list.get(i), number);
        }
        //将map中对应的次数，转化为Set集合
        Set<Integer> set = map.keySet();
        for (int i : set) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i : set) {
            System.out.print(map.get(i)+" ");
        }
        System.out.println();

        //因为输入数字的顺序为从小到大，因此只需要比较次数
        int max = 0;
        int index = 0;
        for (int i : set) {
            if (map.get(i) > max) {
                max = map.get(i);
                index = i;
            }
        }
        System.out.println(index);

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
