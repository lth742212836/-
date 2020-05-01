package 与位算;

import java.util.Scanner;

public class 位操作乘法运算 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((y & 1) == 1) res += x; //判断最低位是否有效，有效相加
            x = x << 1;
            y = y >> 1;    //取y的最低位
        }
        System.out.println(res);
    }

}
/*
输入两个无符号整数x, y, 用位操作实现无符号整数的乘法运算。不用考虑整数的溢出。
输入：
　　235 657
输出：
　　154395
 */