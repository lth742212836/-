package 主测试;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(fun(m,n));
    }
    static int fun(int m,int n){
        if(m<n){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return fun(m-1,n)+fun(m,n-1);
    }
}