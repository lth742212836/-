package 主测试;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        List<Integer> list=new ArrayList<>();
        for (int i = 2; i < x; i++) {

            //判断是否为质数
            int prime = 0;//0表示是质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = 1;
                    break;
                }
            }

            //进行统计
            if (prime == 0) {
                list.add(i);
                count++;
            }

        }
        //输出
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(count);


    }
}