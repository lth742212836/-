package Big;

import java.util.Scanner;

public class _2的次幂表示 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        dp(Integer.toBinaryString(i));//转化为二进制

    }

    static void dp(String arr) {
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '1') {//判断当前位是否为0，如果为0，直接跳过
                if (i == arr.length() - 1) {//当为 "01",即到了当前数的最后一位1，转化为二进制为 2(0)
                    System.out.print("2(0)");
                } else {
                    if (i == arr.length() - 2) {//当为 "1x"
                        System.out.print("2");

                        if (arr.charAt(i + 1) == '1') {//判断是否有下一位
                            System.out.print("+");
                        }
                    } else {
                        System.out.print("2(");
                        dp(Integer.toBinaryString(arr.length() - i - 1));
                        System.out.print(")");

                        if(arr.substring(i+1).contains("1")){ //判断后面的数是否能继续进行
                            System.out.print("+");
                        }
                    }

                }
            }


        }
    }
}
/*
问题描述
　　任何一个正整数都可以用2进制表示，例如：137的2进制表示为10001001。
　　将这种2进制表示写成2的次幂的和的形式，令次幂高的排在前面，可得到如下表达式：137=2^7+2^3+2^0
　　现在约定幂次用括号来表示，即a^b表示为a（b）
　　此时，137可表示为：2（7）+2（3）+2（0）
　　进一步：7=2^2+2+2^0 （2^1用2表示）
　　3=2+2^0
　　所以最后137可表示为：2（2（2）+2+2（0））+2（2+2（0））+2（0）
　　又如：1315=2^10+2^8+2^5+2+1
　　所以1315最后可表示为：
　　2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
输入格式
　　正整数（1<=n<=20000）
输出格式
　　符合约定的n的0，2表示（在表示中不能有空格）
样例输入
    137
样例输出
    2(2(2)+2+2(0))+2(2+2(0))+2(0)
样例输入
    1315
样例输出
    2(2(2+2(0))+2)+2(2(2+2(0)))+2(2(2)+2(0))+2+2(0)
提示
　　用递归实现会比较简单，可以一边递归一边输出
 */

