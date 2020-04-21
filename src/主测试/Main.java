package 主测试;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String str = sc.nextLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int max = 0;
        String mstr = "";
        for (int i = 0; i < str.length() - n + 1; i++) {
            for (int j = i + n; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if (map.containsKey(temp)) {
                    int value = map.get(temp);
                    value++;
                    if (value > max) {
                        max = value;
                        mstr = temp;
                    } else {
                        if (value == max) {
                            if (mstr.length() < temp.length()) {
                                mstr = temp;
                            }
                        }
                    }
                    map.put(temp, value);
                }else{
                    map.put(temp, 0);
                }

            }
        }
        System.out.println(mstr);
    }
}
/*
给定一个长度为n的字符串S，还有一个数字L，统计长度大于等于L的出现次数最多的子串（不同的出现可以相交），如果有多个，输出最长的，如果仍然有多个，输出第一次出现最早的。
输入格式
　　第一行一个数字L。
　　第二行是字符串S。
　　L大于0，且不超过S的长度。
输出格式
　　一行，题目要求的字符串。

　　输入样例1：
　　4
　　bbaabbaaaaa

　　输出样例1：
　　bbaa

　　输入样例2：
　　2
　　bbaabbaaaaa

　　输出样例2：
　　aa
 */
