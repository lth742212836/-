package Big;

import java.util.Scanner;

public class 最大最小公倍数 {
    //这是一个简单的贪心算法问题，解决此题，只需要明白一个数学关系
    // 即当三个数互为质数时， 他们之积为最小公倍数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long result;
        if (n == 1 || n == 2) {
            System.out.println(n);
        } else {
            if (n % 2 != 0) {//判断是否为偶数（两个偶数必定不为质数）
                result = n * (n - 1) * (n - 2);
                System.out.println(result);
            } else {
                if (n % 3 != 0) {//判断是否为3的倍数
                    result = n * (n - 1) * (n - 3);
                    System.out.println(result);
                } else {
                    result = (n - 3) * (n - 2) * (n - 1);
                    System.out.println(result);
                }
            }
        }
    }
}
/*
	1、第一想法
	刚开始看到这个题目的时候第一想法就是枚举1~N中任意三个数,然后求它们的最小公倍数,
	从这些最小公倍数中再选择最大的一个即为正确答案,可是1<=N<=10^6,如果要枚举任意三个数,
	最简单的做法就是三个嵌套的for循环,这样的话时间复杂度为O(N^3),会运行超时的。
	2、正确解答
	数学知识:如果三个数互为质数,那么这三个数的乘积便为它们的最小公倍数。

	找规律。N内三个数最大的倍数肯定是n*(n-1)*(n-2)。但是前提是这三个数没有公约数。
	如果n是奇数，这三个数肯定没有公约数，因为如果有公约数，三个连续数的公约数只可能是2，n为奇数，
	结论成立。
	如果n是偶数，n和n-2就有了公约数，肯定要不能选，那么能不能选n-3，就看n是否是3的倍数，
	如果不是，就选(n-3)*(n-1)*n，如果是，就选(n-3)*(n-1)*(n-2)。
 */
