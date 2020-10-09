package Big;

import java.util.Scanner;

public class 合根植物 {

    static int[] s = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        s = new int[m * n + 1];
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            //比较大小，在小的值对应的数组里放大的值，即为大的值为小的根
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            if (s[max] == 0 && s[min] == 0) {//两个都是单独的，进行连根
                s[min] = max;
            } else {
            	//找到根，进行比较大小
                int ma = findRoot(max);
                int mi = findRoot(min);
                if (ma != mi) {
                	//进行连根
                    max = Math.max(ma, mi);
                    min = Math.min(ma, mi);
                    s[min] = max;
                }

            }
        }
        int cou = 0;//对根进行计数
        for (int i = 1; i < s.length; i++) {
            if (s[i] == 0) {
                cou++;
            }
        }
        System.out.println(cou);

    }

    static int findRoot(int num) {//寻根
        if (s[num] != 0) return findRoot(s[num]);
        return num;
    }
}
/*
资源限制
时间限制：2.0s   内存限制：256.0MB
问题描述
　　w星球的一个种植园，被分成 m * n 个小格子（东西方向m行，南北方向n列）。每个格子里种了一株合根植物。
　　这种植物有个特点，它的根可能会沿着南北或东西方向伸展，从而与另一个格子的植物合成为一体。


　　如果我们告诉你哪些小格子间出现了连根现象，你能说出这个园中一共有多少株合根植物吗？
输入格式
　　第一行，两个整数m，n，用空格分开，表示格子的行数、列数（1<m,n<1000）。
　　接下来一行，一个整数k，表示下面还有k行数据(0<k<100000)
　　接下来k行，第行两个整数a，b，表示编号为a的小格子和编号为b的小格子合根了。


　　格子的编号一行一行，从上到下，从左到右编号。
　　比如：5 * 4 的小格子，编号：
　　1 2 3 4
　　5 6 7 8
　　9 10 11 12
　　13 14 15 16
　　17 18 19 20
样例输入
	5 4
	16
	2 3
	1 5
	5 9
	4 8
	7 8
	9 10
	10 11
	11 12
	10 14
	12 16
	14 18
	17 18
	15 19
	19 20
	9 13
	13 17
样例输出
	5
 */
