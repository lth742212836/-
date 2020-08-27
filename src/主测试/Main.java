package 主测试;

import java.util.Scanner;

public class Main {

    static int p;
    static int max=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//走廊的长度
        p=sc.nextInt();//跳的最大距离
        int x=sc.nextInt();//跳的次数
        int[] wi=new int[n];
        for (int i = 0; i < wi.length; i++) {
            wi[i]=sc.nextInt();//每一格的权值
        }
        dfs(wi,x,0,n);
        System.out.println(max);


    }
    /*
        arr[]   权值数组
        x       跳的次数
        sum     权值和
        n       走廊长度

     */
    static void dfs(int[] wi,int x,int sum,int n){
        if(x==0 || n==0){
            if(max<sum){
                max=sum;
            }
            return;
        }

        int temp=0;//跳跃格的权值和
        for (int i = 1; i <= p; i++) {
            temp+=wi[i];
            dfs(wi,x-1,sum+temp,n-i);
        }

    }

}