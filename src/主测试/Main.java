package 主测试;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();

        BigInteger one=new BigInteger(a);
        BigInteger two=new BigInteger(b);
        System.out.println(one.subtract(two));


    }
}
