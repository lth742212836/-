package 主测试;

import java.util.Scanner;

public class Main {
    final static int M = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();

        int[][] d=new int[l][k];

        for (int j = 1; j < k; j++) {
            d[0][j] = 1;
        }
        for (int i = 1; i < l; i++) {
            for (int j = 0; j < k; j++) {
                d[i][j]=0;

                for (int r = 0; r < k; r++) {
                    if(r!=j+1 && r!=j-1){
                        d[i][j]+=d[i-1][r];
                        d[i][j] %= M;
                    }
                }
            }
        }

        int ans=0;
        for (int j = 0; j < k; j++) {
            ans+=d[l-1][j];
            ans%=M;
        }
        System.out.println(ans);
    }

}