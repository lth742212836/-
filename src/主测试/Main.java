package 主测试;

import java.util.Scanner;

public class Main {
    static int result=0;
    static int n=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int[][] arr=new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        dfs(arr,0,0,arr[0][0]);
        System.out.println(result);

    }
    /*
        i       行
        j       列
        sum     当前方法的和
     */
    static void dfs(int[][] arr,int i,int j,int sum){
        if(i==n-1 || j==n-1){
            if(sum>result){
                result=sum;
            }
            return;
        }

        //向下
        dfs(arr,i+1,j,sum+arr[i+1][j]);

        //向右下
        dfs(arr,i+1,j+1,sum+arr[i+1][j+1]);
    }
}