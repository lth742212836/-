package Big;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 进攻策略加强 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //输入开始
        int m = s.nextInt();
        int n = s.nextInt();
        int k = s.nextInt();
        int[] wi = new int[m];
        int[] pi = new int[m];
        for (int i = 0; i < pi.length; i++) {
            wi[i] = s.nextInt();//僵尸所耗资源
        }
        for (int i = 0; i < pi.length; i++) {
            pi[i] = s.nextInt();//攻击效果
        }
        int[] qi = new int[n];
        for (int i = 0; i < qi.length; i++) {
            qi[i] = s.nextInt();//每行的防守力
        }
        //键盘输入结束

        // 构造动态数组，数组的长度是i,变换区间为：[0,i]->[j,j+i]，
        // 从而计算出当资源用完时，可以最大攻破的数组长度，即为最终答案。
        int T = 0;
        for (int i = n - 1; i >= 0; i--) {// i为数组长度
            for (int j = 0; j + i >= i && j + i < n; j++) {// j决定从哪一行开始
                int a = k;//重置资源总数
                int count = 0;//行数
                for (int z = j; z <= j + i; z++) {// 遍历[j,j+i]的区间
                    int x = getPrefferred(wi, pi, qi, z);//消耗的资源
                    if (a >= x) {//拥有的资源大于消耗的资源
                        count++;//行数增加
                        a -= x;//资源减少
                    } else {
                        break;
                    }
                }
                if (count > T) {//比较获得最大行数
                    T = count;
                    if (T >= i + 1) {
                        System.out.println(T);
                        return;
                    }
                }
            }
        }
        System.out.println(T);
    }

    static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static int getPrefferred(int[] wi, int[] pi, int[] qi, int index) {
        //剪枝，消除植物的对应行所需的攻击相同时，所需要消耗的资源
        Integer dp = map.get(qi[index]);
        if (dp != null) return dp;

        // 定义一个最大值，便于更新每一行的最小耗费
        int price = Integer.MAX_VALUE;
        for (int i = 0; i < wi.length; i++) {

            // 第index行最小花费的资源(每一行只能用一种僵尸
            int pc = (int) (Math.ceil(qi[index] * 1.0 / pi[i]) * wi[i]);
            if (pc < price) {//判断所需消耗的最少资源
                price = pc;
            }
        }
        map.put(qi[index], price);//植物的index行消除，所需要的资源
        return price;//返回消耗所需的资源
    }
}
/*
问题描述
　　植物大战僵尸这款游戏中，还有一个特别的玩儿法：玩家操纵僵尸进攻植物。
　　首先，僵尸有m种（每种僵尸都是无限多的），玩家可以选择合适的僵尸来进攻。使用第i种僵尸需要花费Wi资源，可以得到Pi的攻击效果。在这里，我们认为多个僵尸总的攻击效果就是他们每个攻击效果的代数和。
　　地图共有n行，对于第i行，最左端有若干植物，这些植物需要至少Qi的攻击才能被全部消灭。若一行上的植物全部被消灭，我们称这一行被攻破。
　　由于资源紧张，你只有总量为K的资源，不一定能够攻破所有行。但统治者希望攻破相邻的T行，并希望T尽量的大。你能帮他算出T的值吗？
输入格式
　　第一行三个非负整数：m、n、K；
　　第二行m个正整数，第i个数表示Wi；
　　第三行m个正整数，第i个数表示Pi；
　　第四行n个非负整数，第i个数表示Qi。
输出格式
　　3 11 39
　　5 2 11
　　3 1 7
　　5 3 6 10 3 2 4 200 1 1 1
样例输入
一个满足题目要求的输入范例。
例：
    2 2
    1 2
    3 4
样例输出
    4
数据规模和约定
　　对于70%的数据：n<=1000

　　对于100%的数据：n<=200000，m<=100，K<=1000000，所有Pi、Qi<=100000000
 */