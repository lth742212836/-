package Big;

import java.util.Scanner;

public class Anagrams单词 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int[] arr=new int[92];

        String s1 = str1.toUpperCase();
        String s2 = str2.toUpperCase();
//        System.out.println(s1);
        if(s1.length()!=s2.length()){
            System.out.println("no");
        }else {
            for (int i = 0; i < s1.length(); i++) {
                int x=s1.charAt(i);
                arr[x]++;
            }
            for (int i = 0; i < s2.length(); i++) {
                int y=s2.charAt(i);
                arr[y]--;
            }
            int lead=-1;
            for (int i = 65; i < 92; i++) {
                if(arr[i]!=0){
                    lead=1;
                    break;
                }
            }
            if(lead==-1){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

    }
}
/*
Anagrams指的是具有如下特性的两个单词：在这两个单词当中，每一个英文字母（不区分大小写）所出现的次数都是相同的。例如，Unclear和Nuclear、Rimon和MinOR都是Anagrams。编写一个程序，输入两个单词（只包含英文字母），然后判断一下，这两个单词是否是Anagrams。每一个单词的长度不会超过80个字符，而且是大小写无关的。
　　Input:长度不超过80个字符的两个单词，用空格隔开，不考虑字母大小写 （大小写无关）
　　Output: yes或者no
输入:
　　Rimon MinOR
输出:
　　yes
 */