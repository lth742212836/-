package Big;

import java.util.Scanner;

public class 出现次数最多数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[i][0] == arr[j][0]) {
                    arr[j][1]++;
                    break;
                }
            }
        }
        int max = 0;
        int down = 0;
        for (int i = 0; i < n; i++) {
            if (max <= arr[i][1]) {
                if (max == arr[i][1]) {
                    if (arr[down][0] < arr[i][0]) {
                        continue;
                    }
                }
                max = arr[i][1];
                down = i;
            }
        }
        System.out.println(arr[down][0]);
    }
}
/*
编写一个程序，读入一组整数，这组整数是按照从小到大的顺序排列的，它们的个数N也是由用户输入的，最多不会超过20。然后程序将对这个数组进行统计，把出现次数最多的那个数组元素值打印出来。如果有两个元素值出现的次数相同，即并列第一，那么只打印较小的那个值。例如，假设用户输入的是“100 150 150 200 250”，则输出为150。
输入:
　　6
　　100 150 150 200 200 250
输出:
　　150
 */