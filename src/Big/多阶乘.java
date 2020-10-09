package Big;

import java.util.Scanner;

public class 多阶乘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        long sum = 0;
        int temp = n;
        int q = 1;
        for (int i = 1; i <= k; i++) {
            temp = n;
            long sumtemp = 1;

            while (temp > 0) {//计算每个阶乘
                sumtemp = sumtemp * temp;
                temp = n - q * i;
                q++;
            }
            sum += sumtemp;

        }
        if (m == 1) {
            System.out.println(sum);
        } else {
            long lo = 0;
            while (sum != 0) {
                lo += sum % 10;
                sum = sum / 10;
            }
            System.out.println(lo);
        }
    }
}