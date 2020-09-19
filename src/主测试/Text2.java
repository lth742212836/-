package 主测试;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long temp=n;
        double sum=n;//欧拉数

        if(n<2){
            System.out.println(0);
            return;
        }
        double x=0;
        for (int i = 2; i<temp; i++) {
            if(n%i==0){
                x=1-1.0/i;
                sum=sum*x;
//                while(n%i==0){
                    n=n/i;
//                }
            }

        }
        System.out.println((long) sum);

    }
}
