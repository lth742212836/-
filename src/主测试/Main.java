package 主测试;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int i=sc.nextInt();
        int[] pkind=new int[p];
        int[] ikind=new int[i];
        for (int j = 0; j < p; j++) {
            pkind[j]=sc.nextInt();
        }
        for (int j = 0; j < i; j++) {
            ikind[j]=sc.nextInt();
        }
        int[][] price=new int[p][i];
        for (int j = 0; j < p; j++) {
            for (int k = 0; k < i; k++) {
                price[p][i]=sc.nextInt();
            }
        }


    }
}