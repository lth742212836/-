package Big;

import java.util.Scanner;

public class 猴子吃包子 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();//肉包
        int y=sc.nextInt();//菜包
        int z=sc.nextInt();//无馅包
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int z1=sc.nextInt();
        int side=sc.nextInt();

        double time=0;
        time=x1*1.0/x+y1*1.0/y+z1*1.0/z;
        System.out.printf("%."+side+"f",time);
    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　从前，有一只吃包子很厉害的猴子，它可以吃无数个包子，但是，它吃不同的包子速度也不同；肉包每秒钟吃x个；韭菜包每秒钟吃y个；没有馅的包子每秒钟吃z个；现在有x1个肉包，y1个韭菜包，z1个没有馅的包子；问：猴子吃完这些包子要多久？结果保留p位小数。
输入格式
　　输入1行，包含7个整数，分别表示吃不同包子的速度和不同包子的个数和保留的位数。
输出格式
　　输出一行，包含1个实数，表示吃完所有包子的时间。
样例输入
    4 3 2 20 30 15 2
样例输出
    22.50
数据规模和约定
　　0<x<100;0<y<100;0<z<100;0<x1<=1000000;0<y1<=10000000;0<z1<=10000000;0<p<=1000
 */
