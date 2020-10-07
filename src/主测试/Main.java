package 主测试;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char[] chars = str.toCharArray();
        Stack<String> sta=new Stack();
        sta.push(str);
        System.out.println(sta.size());
        System.out.println(sta);
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println("第"+i+"次：="+chars[i]+"=");
//        }


    }

}