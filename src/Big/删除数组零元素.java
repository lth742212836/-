package Big;

import java.util.Scanner;

public class 删除数组零元素 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //储存非0数字
        int[] arr = new int[n];
        int tit=0;

        int temp=0;

        int sum=0;//非0数字的个数
        for (int i = 0; i < n; i++) {
            temp=sc.nextInt();
            if(temp!=0){
                arr[tit]=temp;
                tit++;
                sum++;
            }
        }

        //输出结果
        System.out.println(sum);
        for (int i = 0; i < tit; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
/*
时间限制：1.0s   内存限制：512.0MB
从键盘读入n个整数放入数组中，编写函数CompactIntegers，删除数组中所有值为0的元素，其后元素向数组首端移动。注意，CompactIntegers函数需要接受数组及其元素个数作为参数，函数返回值应为删除操作执行后数组的新元素个数。输出删除后数组中元素的个数并依次输出数组元素。
样例输入: （输入格式说明：5为输入数据的个数，3 4 0 0 2 是以空格隔开的5个整数）
    5
    3 4 0 0 2
样例输出:（输出格式说明：3为非零数据的个数，3 4 2 是以空格隔开的3个非零整数）
    3
    3 4 2
样例输入:
    7
    0 0 7 0 0 9 0
样例输出:
    2
    7 9
样例输入:
    3
    0 0 0
样例输出:
    0
 */