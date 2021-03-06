package Big;

import java.util.Scanner;

public class 汉诺塔 {
    static int num = 0;//移动的次数
    static int m;//规定输出的次数

    public static void move(int n, char a, char b, char c) {
//        if(num==m){
////                System.out.println("#"+(n+1)+": "+a + "->" + c);
//            System.out.println("#"+(n+1)+": "+a + "->" + c);
//        }
        if (n == 1) {
            num++;
            if (num == m) {
                System.out.println("#1: " + a + "->" + c);
            }
            return;
//            System.out.println("move from " + a + " -> to " + c+"   移动的盘子为"+n);
        }else {
            move(n - 1, a, c, b);
            num++;
            if(num==m){
                System.out.println("#"+n+": " + a + "->" + c);
            }
//        move(1, a, b, c);
            move(n - 1, b, a, c);
        }


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        int count = 0;
        move(n, 'A', 'B', 'C');
        System.out.println(num);
    }
}
/*
问题描述
　　汉诺塔是一个古老的数学问题：
　　有三根杆子A，B，C。A杆上有N个(N>1)穿孔圆盘，盘的尺寸由下到上依次变小。要求按下列规则将所有圆盘移至C杆：
　　每次只能移动一个圆盘；
　　大盘不能叠在小盘上面。
　　提示：可将圆盘临时置于B杆，也可将从A杆移出的圆盘重新移回A杆，但都必须遵循上述两条规则。

　　问：如何移？最少要移动多少次？
输入格式
　　一行，包含2个正整数，一个是N（N<=15)，表示要移动的盘子数；一个是M，表示在最少移动d第M步
输出格式
　　共2行。
　　第一行输出格式为：#No: a->b，表示第M步骤具体移动方法，其中No表示第M步移动的盘子的编号（N个盘子从上到下依次编号为1到n），表示第M步是将No号盘子从a杆移动到b杆（a和b的取值均为{A、B、C}）。
　　第2行输出一个整数，表示最少移动步数。
样例输入
    3 2
样例输出
    #2: A->B
    7
数据规模和约定
　　0<N<20，0<M<=最小移动步数
 */
/*
1、本题利用递归思想便可以很简单的理解其思路。在A上有n个盘子时，只需要将上面的n-1个盘中利用C，按规则放置在B上，然后将A上的最后一个盘中放置在C上即可；同理，下一步将B上的n-2个盘子利用C放置在A上即可，以此类推。

void hanoi(int n, char a, char b, char c)
{
     if (n == 1)
     cout<<a<<"->"<<c<<endl;
     else
     {
          hanoi(n - 1, a, c, b); //第n-1个要从a通过c移动到b
          cout<<a<<"->"<<c<<endl;
          hanoi(n - 1, b, a, c); //n-1个移动过来之后b变开始盘，b通过a移动到c
      }
}
2、基本过程完成后，根据题意只需要判断每一步移动时，是移动的第几步，以及移动的是哪一个盘子。
a、加入计数count，每次移动计数即可。
b、当A有n个盘子时，首先移动上面n-1个较小的盘子到B，然后移动最下面最大的第n个盘子到C。以此类推，每次移动都是最下面的盘子，因此当只有一个盘子时，一定是第一个盘子。
 */
