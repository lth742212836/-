package 子串;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 字串统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        String s = "";
        if (sc.hasNext()) {  //输入数字l与字符串s
            l = sc.nextInt();
            s = sc.next();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();   //使用map中key保存字符串 value保存字符串出现的次数
        int maxValue = 0;  //保存字符串的出现次数的最大值
        String maxStr = "";    //保存出现次数最多的字符串
        for (int i = 0; i < s.length() - l + 1; i++) {
            for (int j = i + l; j < s.length(); j++) {
                String str = s.substring(i, j); //枚举截取长度大于等于l的字符串
                if (map.containsKey(str)) {   //若该字符串之前出现过则map(key,value)中value值+1
                    int value = map.get(str);
                    value++;
                    if (value > maxValue) {
                        maxValue = value;
                        maxStr = str;
                    } else if (value == maxValue) {    //若该字符串出现的次数与当前出现次数最多的字符串相等，则比较两个字符串的长度，取字符串长的
                        if (maxStr.length() < str.length()) {
                            maxStr = str;
                        }
                    }
                    map.put(str, value);
                } else {  //若该字符串之前并未出现过则添加，并初始化value值为0
                    map.put(str, 0);
                }
            }
        }
        System.out.println(maxStr); //输出出现次数最多的字符串
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
}
