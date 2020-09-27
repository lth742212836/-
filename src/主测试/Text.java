package 主测试;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder arr=new StringBuilder("MyHelloWorld");
        String order=sc.nextLine();
        if(order.contains("Swap")){
            int whiteA=order.indexOf(" ",5);
            String number=order.substring(5,whiteA);//将指定范围内的数字取出
            int a = Integer.parseInt(number);//将包含数字的字符串转化为数字
//            System.out.println("数字a="+a+"=");

            int whiteB=order.indexOf(" ",whiteA+1);
//            System.out.println(whiteB);
            number=order.substring(whiteA+1,whiteB);//将指定范围内的数字取出
            int b = Integer.parseInt(number);//将包含数字的字符串转化为数字
//            System.out.println("数字b="+b+"=");

            int whiteC=order.indexOf(" ",whiteB+1);
//            System.out.println(whiteC);
            number=order.substring(whiteB+1,whiteC);//将指定范围内的数字取出
            int c = Integer.parseInt(number);//将包含数字的字符串转化为数字
//            System.out.println("数字c="+c+"=");

            number=order.substring(whiteC+1);//将指定范围内的数字取出
            int d = Integer.parseInt(number);//将包含数字的字符串转化为数字
//            System.out.println("数字d="+d+"=");

            String one = arr.substring(a-1, b );
//            System.out.println("one="+one+"=");
            String two = arr.substring(c-1, d );
//            System.out.println("two="+two+"=");

            StringBuilder temp1=new StringBuilder(arr.substring(0, a - 1));
            temp1.append(two);//拼接上第二段

            StringBuilder temp2=new StringBuilder(arr.substring(b, c-1));
//            System.out.println("temp2="+temp2+"=");
            temp1.append(temp2);//拼接上第一段与第二段中间的部分

//            StringBuilder temp3=new StringBuilder(arr.substring(a-1, b));
//            System.out.println("temp3="+temp3+"=");
            temp1.append(one);//拼接上第一段

            StringBuilder temp4=new StringBuilder(arr.substring(d, arr.length()));
            System.out.println(temp1.append(temp4));//拼接上第二段之后的


        }



    }
}
/*
My
2
Append Hello
Insert 3 dlroW

MyWorldHello
2
Swap 3 7 8 12
Swap 1 2 3 7

 */