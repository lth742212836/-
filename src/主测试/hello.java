package 主测试;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = 3;
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + k) % i;
        }
        System.out.println(p + 1);
    }
}
