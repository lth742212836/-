package Big;

import java.util.Scanner;


public class 寻找字符串位置暴力 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String s = sc.nextLine();

        /*
            方法一
         */
        int result = query(p, s);
        System.out.println(result);

        /*
            方法二
         */
        int i = s.indexOf(p);
        System.out.println(i);
    }

    /**
     * 寻找在源串中的位置
     *
     * @param p 要寻找的字符串
     * @param s 源串
     * @return 位置对应的下标
     */
    static int query(String p, String s) {
        int i = 0;//p
        int j = 0;//s		源串
        int sc = j;
        while (sc < s.length()) {
            /**
             * 挨个比较，对匹配后的数量进行累计，然后与字符串的长度进行比较
             * i  ：统计字符串的长度
             * j  ：记录当前位置
             */
            if (p.charAt(i) == s.charAt(sc)) {
                sc++;
                i++;
                if (i == p.length()) {
                    return j;
                }
            } else {
                j++;
                sc = j;
                i = 0;
            }
        }
        return -1;
    }
}

