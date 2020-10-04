package Big;

import java.util.Scanner;

public class Anagrams问题 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toLowerCase();//输入数据，并转化为小写
        String b=sc.nextLine().toLowerCase();

        char[] arr1 = a.toCharArray();//转化为字符数组
        char[] arr2 = b.toCharArray();
        int len=0;//判断len是否为字符数组的长度

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr2[j]=='0'){
                    continue;
                }
                if(arr1[i]==arr2[j]){
                    len++;
                    arr2[j]='0';
                    break;
                }
            }
        }
        if(len==arr1.length){
            System.out.println("Y");
        }else {
            System.out.println("N");
        }
    }
}
/*
资源限制
时间限制：1.0s   内存限制：512.0MB
问题描述
　　Anagrams指的是具有如下特性的两个单词：在这两个单词当中，每一个英文字母（不区分大小写）所出现的次数都是相同的。
例如，“Unclear”和“Nuclear”、“Rimon”和“MinOR”都是Anagrams。编写一个程序，输入两个单词，然后判断一下，
这两个单词是否是Anagrams。每一个单词的长度不会超过80个字符，而且是大小写无关的。
　　输入格式：输入有两行，分别为两个单词。
　　输出格式：输出只有一个字母Y或N，分别表示Yes和No。
　　输入输出样例
样例输入
    Unclear
    Nuclear
样例输出
    Y
 */