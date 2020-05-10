package Big;

import java.util.Scanner;

public class _1的个数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='1'){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}