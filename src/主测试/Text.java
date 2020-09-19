package 主测试;

import java.math.BigInteger;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            res = res.multiply( BigInteger.ONE.add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(k)))   );
        }
        String r = res.toString();
        int count = 0;//末尾0的个数
        char cc = 'a';//最后一个非零数
        for (int i = r.length() - 1; i >= 0; i--) {
            char c = r.charAt(i);
            if (c != '0') {
                cc = c;
                break;
            }
            count++;
        }
        System.out.println(count);
        System.out.println(cc);
    }
}