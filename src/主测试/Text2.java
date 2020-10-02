package 主测试;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        StringBuilder arr=new StringBuilder("MyHello");
        String order="Insert 3 dlroW";
        reverse(order,arr);
    }
    public static StringBuilder reverse(String order,StringBuilder arr){
        //取出其中的数字
        int end = order.indexOf(" ", 7);
        String number=order.substring(7,end);//将指定范围内的数字取出
        int index = Integer.parseInt(number);//将包含数字的字符串转化为数字

        //要添加的字符串
        String add=order.substring(end+1);

        //添加字符串
        StringBuilder insert = arr.insert(index - 1, add);
        System.out.println(insert);
        return arr;

    }
}
