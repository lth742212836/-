package Big;

import java.util.Scanner;

public class 前缀表达式 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String arr= scanner.next();
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        switch (arr){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                break;
        }
    }
}
/*
资源限制
时间限制：1.0s   内存限制：512.0MB
问题描述
　　编写一个程序，以字符串方式输入一个前缀表达式，然后计算它的值。输入格式为：“运算符 对象1 对象2”，其中，运算符为“+”（加法）、“-”（减法）、“*”（乘法）或“/”（除法），运算对象为不超过10的整数，它们之间用一个空格隔开。要求：对于加、减、乘、除这四种运算，分别设计相应的函数来实现。
　　输入格式：输入只有一行，即一个前缀表达式字符串。
　　输出格式：输出相应的计算结果（如果是除法，直接采用c语言的“/”运算符，结果为整数）。
　　输入输出样例
样例输入
    + 5 2
样例输出
    7
 */