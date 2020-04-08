package 蓝桥2015;

import  java.util.Scanner;

public class 饮料换购 {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dfs(n);
        System.out.println(sum+n);
    }
    public static void dfs(int n){
        if(n>=3){
            sum++;
            dfs(n-2);
        }
    }
}
