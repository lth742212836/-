package Big;

import java.util.Scanner;

public class 未名湖边的烦恼2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[19][19];
        for (int i = 1; i <= m; i++) {
            arr[i][0] = 1;             //当还鞋的大于零，借鞋的为零时都只为一种
            for (int j = 1; j <= n; j++) {
                if (i > j) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
                if (i == j) {
                    arr[i][j] = arr[i][j - 1];
                }
            }
        }

        System.out.println(arr[m][n]);

    }
}
/*
问题描述
　　每年冬天，北大未名湖上都是滑冰的好地方。北大体育组准备了许多冰鞋，可是人太多了，每天下午收工后，常常一双冰鞋都不剩。
　　每天早上，租鞋窗口都会排起长龙，假设有还鞋的m个，有需要租鞋的n个。现在的问题是，
这些人有多少种排法，可以避免出现体育组没有冰鞋可租的尴尬场面。
（两个同样需求的人（比如都是租鞋或都是还鞋）交换位置是同一种排法）
输入格式
　　两个整数，表示m和n
输出格式
　　一个整数，表示队伍的排法的方案数。
样例输入
    3 2
样例输出
    5
数据规模和约定
　　m,n∈［0,18］
　　问题分析
*/