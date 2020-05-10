package 主测试;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextInt();
        double x=Math.sqrt(n);
        long res=0;
        if(n<=0){
            res=0;
        }
        else if(((long)x*(long)x)==n)
            res=(long)x;
        else res=(long) x+1;
        System.out.println(res*res);
    }

}
