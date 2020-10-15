package Big;

import java.util.Scanner;

public class 未名湖边的烦恼 {

    public static int method(int m, int n, int num) {
        //还鞋的人为0或者租鞋的人为0都直接结束
        if (m == 0 || n == 0) {
            return 1;
        }
        //这就是那两种情况 鞋数大于0的话 还鞋和租鞋的都能排 否则只能排还鞋的
        if (num > 0) {
            return method(m - 1, n, num + 1) + method(m, n - 1, num - 1);
        } else {
            return method(m - 1, n, num + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        //还鞋小于租鞋的直接返0 否则就进递归 刚开始体育组鞋数为0
        if (m >= n) {
            System.out.println(method(m, n, 0));
        } else {
            System.out.println(0);
        }
    }

}
/*
问题描述
　　每年冬天，北大未名湖上都是滑冰的好地方。北大体育组准备了许多冰鞋，可是人太多了，每天下午收工后，常常一双冰鞋都不剩。
　　每天早上，租鞋窗口都会排起长龙，假设有还鞋的m个，有需要租鞋的n个。
现在的问题是，这些人有多少种排法，可以避免出现体育组没有冰鞋可租的尴尬场面。
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