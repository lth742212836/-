package Big;

import java.util.Scanner;

public class 素因子去重 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 1;
        for (long i = 2; i <= n; i++) {
            if (n % i == 0) {//寻找素因子
                sum *= i;
            }
            while (n % i == 0) {//去重
                n /= i;
            }
        }
        System.out.println(sum);
    }
    /*方法二
    import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Long n = new Scanner(System.in).nextLong();
        ArrayList<Long> list = new ArrayList<Long>();
        //从2到n找素因子
        for (long i = 2; i <= n; i++) {
            //i是素因子
            if(n%i==0 && juge(i)){
                //素因子去重
                while(n%i==0){
                    n/=i;
                }

                //将素因子添加到集合
                list.add(i);
                if(n<i)
                    break;
            }
        }

        long p = 1;
        //将所有素因子相乘，得出最后结果p
        for (int i = 0; i < list.size(); i++) {
            p*=(long)list.get(i);
        }
        System.out.println(p);
    }

    //判断因子是否是素数
    public static boolean juge(long m){
        int sqrt = (int) Math.sqrt(m);
        for (int i = 2; i <= sqrt; i++) {
            if(m%i==0)
                return false;
        }
        return true;
    }
}
     */
}
/*
    资源限制
    时间限制：1.0s   内存限制：256.0MB
    问题描述
    　　给定一个正整数n，求一个正整数p，满足p仅包含n的所有素因子，且每个素因子的次数不大于1
    输入格式
    　　一个整数，表示n
    输出格式
    　　输出一行，包含一个整数p。
    样例输入
    1000
    样例输出
    10
    数据规模和约定
    　　n<=10^12
    　　样例解释：n=1000=2^3*5*3，p=2*5=10
 */