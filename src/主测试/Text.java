package 主测试;

import java.math.BigInteger;
import java.util.Scanner;

public class Text {
    static int num=0;//移动的次数
    static int m;//规定输出的次数
    public static void move(int n, char a, char b, char c) {

        if (n==1 ){

//            System.out.println("move from " + a + " -> to " + c+"移动次数为"+num);
            num++;
        } else {
            move(n - 1, a, c, b);
            move(1, a, b, c);
            move(n - 1, b, a, c);
        }
        if(num==m){
            System.out.println("#"+(n+1)+": "+a + "->" + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        m=sc.nextInt();
        int count=0;
        move(n, 'A', 'B', 'C');
        System.out.println(num);
    }
}