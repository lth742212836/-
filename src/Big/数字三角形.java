package Big;

import java.util.Scanner;

public class 数字三角形 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length = reader.nextInt();
        int[][] arr = new int[length][length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= count; j++) {
                arr[i][j] = reader.nextInt();
            }
            count++;
        }
        count = 1;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j <= count; j++) {
                if (j == 0) {
                    arr[i][j] += arr[i - 1][j];
                } else {
                    if (arr[i - 1][j - 1] > arr[i - 1][j])
                        arr[i][j] += arr[i - 1][j - 1];
                    else
                        arr[i][j] += arr[i - 1][j];
                }
            }
            count++;
        }
        int max = arr[length - 1][0];
        for (int i = 1; i < length; i++) {
            if (arr[length - 1][i] > max) {
                max = arr[length - 1][i];
            }
        }
        System.out.println(max);
    }

}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　（图３.１－１）示出了一个数字三角形。 请编一个程序计算从顶至底的某处的一条路
　　径，使该路径所经过的数字的总和最大。
　　●每一步可沿左斜线向下或右斜线向下走；
　　●1＜三角形行数≤100；
　　●三角形中的数字为整数0，1，…99；
             7
            3 8
           8 1 0
          2 7 4 4
         4 5 2 6 5
输入格式
　　文件中首先读到的是三角形的行数。

　　接下来描述整个三角形
输出格式
　　最大总和（整数）
样例输入
    5
    7
    3 8
    8 1 0
    2 7 4 4
    4 5 2 6 5
样例输出
    30
 */

