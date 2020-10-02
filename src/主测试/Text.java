package 主测试;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String begin=sc.nextLine();
        StringBuilder arr=new StringBuilder(begin);
        System.out.println(arr);
        int n=Integer.parseInt(sc.nextLine());
        System.out.println(n);
        String[] orders=new String[n];
        for (int i = 0; i < n; i++) {
            orders[i]=sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(orders[i]);
        }
    }
}