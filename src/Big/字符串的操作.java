package Big;

import java.util.Scanner;

public class 字符串的操作 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String begin=sc.nextLine();
        StringBuilder arr=new StringBuilder(begin);

        int n=sc.nextInt();
        String[] orders=new String[n];
        sc.nextLine();
        for (int i = 0; i <n; i++) {
            orders[i]=sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            String order=orders[i];
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
                StringBuilder reverse=reverse(order,arr);
                arr=reverse;
            }
//            System.out.println("第"+i+"次=="+arr+"=");
        }
        System.out.println(arr);

    }
    public static StringBuilder swap(String order,StringBuilder arr){
        int whiteA=order.indexOf(" ",5);
        String number=order.substring(5,whiteA);//将第一个数字取出
        int a = Integer.parseInt(number);//将包含数字的字符串转化为数字

        int whiteB=order.indexOf(" ",whiteA+1);
        number=order.substring(whiteA+1,whiteB);//将第二个数字取出
        int b = Integer.parseInt(number);//将包含数字的字符串转化为数字

        int whiteC=order.indexOf(" ",whiteB+1);
        number=order.substring(whiteB+1,whiteC);//将第三个数字取出
        int c = Integer.parseInt(number);//将包含数字的字符串转化为数字

        number=order.substring(whiteC+1);//将第四个数字取出
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

    public static StringBuilder reverse(String order,StringBuilder arr){
        int whiteA=order.indexOf(" ",8);
        String number=order.substring(8,whiteA);//将第一个数字取出
        int a = Integer.parseInt(number);//将包含数字的字符串转化为数字

        number=order.substring(whiteA+1);//将第二个数字取出
        int b = Integer.parseInt(number);//将包含数字的字符串转化为数字

        StringBuilder change=new StringBuilder(arr.substring(a-1, b));//取出反转范围内的字符
        change.reverse();//反转
        StringBuilder temp1=new StringBuilder(arr.substring(0, a - 1));//取出反转范围之前的字符
        StringBuilder temp2=new StringBuilder(arr.substring(b, arr.length()));//取出反转范围之后的字符
        temp1.append(change).append(temp2);//拼接
        return temp1;

    }
}
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
　　给出一个字符串S，然后给出q条指令，分别有4种：

　　1. Append str
　　表示在S的最后追加一个字符串str。
　　例：
　　原字符串：ABCDE
　　执行 Append FGHIJ 后
　　字符串变为：ABCDEFGHIJ

　　2. Insert x str
　　表示在位置x处插入一个字符串str。（输入保证0<x<=当前字符串长度）
　　例：
　　原字符串：ABCGHIJ
　　执行 Insert 4 DEF 后
　　字符串变为：ABCDEFGHIJ

　　3. Swap a b c d
　　表示交换从第a位到第b位的字符串与从第c位到第d位的字符串。（输入保证0<a<b<c<d<=当前字符串长度）
　　例：
　　原字符串：ABGHIFCDEJ
　　执行 Swap 3 5 7 9后
　　字符串变为：ABCDEFGHIJ

　　4. Reverse a b
　　表示将从第a位到第b位的字符串反转。（输入保证0<a<b<=当前字符串长度）
　　例：
　　原字符串：ABGFEDCHIJ
　　执行 Reverse 3 7 后
　　字符串变为：ABCDEFGHIJ

　　最后输出按顺序执行完指令后的字符串。
输入格式
　　输入第一行包含字符串S，第二行包含一个整数q，接下来q行分别为q个指令。
输出格式
　　输出为1行，为按顺序执行完输入指令后的字符串。
样例输入
    My
    5
    Append Hello
    Insert 3 dlroW
    Reverse 3 7
    Swap 3 7 8 12
    Swap 1 2 3 7
样例输出
    HelloMyWorld
样例说明
　　原字符串：My
　　执行 Append Hello 后：MyHello
　　执行 Insert 3 dlroW 后：MydlroWHello
　　执行 Reverse 3 7 后：MyWorldHello
　　执行 Swap 3 7 8 12 后：MyHelloWorld
　　执行 Swap 1 2 3 7 后：HelloMyWorld
数据规模和约定
　　对于30%的数据，q=1；
　　对于70%的数据，如有Swap指令，Swap指令中b-a=d-c；
　　对于100%的数据，最终字符串长度不大于40000，1<=q<=150
 */