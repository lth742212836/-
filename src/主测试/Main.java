package 主测试;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp=sc.nextLine();
        int n=sc.nextInt();
        sc.nextLine();
        StringBuilder arr=new StringBuilder(temp);
        for (int i = 0; i < n; i++) {
            String order=sc.nextLine();
            if(order.contains("Append")){//拼接从Append之后的字符串
                arr.append(order.substring(7,order.length()));
            }

            if(order.contains("Insert")){
                StringBuilder insert = insert(order, arr);
                arr=insert;
            }

            if(order.contains("Swap")){
                StringBuilder swap = swap(order, arr);
                arr=swap;
            }
            if(order.contains("Reverse")){

            }


        }
        System.out.println("最终结果为"+arr);

    }
    public static StringBuilder swap(String order,StringBuilder arr){
        int whiteA=order.indexOf(" ",5);
        String number=order.substring(5,whiteA);//将指定范围内的数字取出
        int a = Integer.parseInt(number);//将包含数字的字符串转化为数字

        int whiteB=order.indexOf(" ",whiteA+1);
        number=order.substring(whiteA+1,whiteB);//将指定范围内的数字取出
        int b = Integer.parseInt(number);//将包含数字的字符串转化为数字

        int whiteC=order.indexOf(" ",whiteB+1);
        number=order.substring(whiteB+1,whiteC);//将指定范围内的数字取出
        int c = Integer.parseInt(number);//将包含数字的字符串转化为数字

        number=order.substring(whiteC+1);//将指定范围内的数字取出
        int d = Integer.parseInt(number);//将包含数字的字符串转化为数字

        String one = arr.substring(a-1, b );
        String two = arr.substring(c-1, d );

        StringBuilder temp1=new StringBuilder(arr.substring(0, a - 1));
        temp1.append(two);//拼接上第二段

        StringBuilder temp2=new StringBuilder(arr.substring(b, c-1));
        temp1.append(temp2);//拼接上第一段与第二段中间的部分

        temp1.append(one);//拼接上第一段

        StringBuilder temp4=new StringBuilder(arr.substring(d, arr.length()));
        StringBuilder append = temp1.append(temp4);//拼接上第二段之后的
        return append;
    }
    public static StringBuilder insert(String order,StringBuilder arr){
        //取出其中的数字
        int end = order.indexOf(" ", 7);
        String number=order.substring(7,end);//将指定范围内的数字取出
        int index = Integer.parseInt(number);//将包含数字的字符串转化为数字

        //要添加的字符串
        String add=order.substring(end+1);

        //添加字符串
        StringBuilder insert = arr.insert(index - 1, add);
        return insert;
    }
}