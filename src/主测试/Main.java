package 主测试;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        sc.nextLine();
        System.out.println("a和b的值为："+a+" "+b);

        int ans=0;
        int temp=0;
        int x=1;
        char[] s=sc.nextLine().toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i]>=49 && s[i]<=58){
                System.out.println(i+"====="+s[i]+"=======");
                temp=s[i]-'0';
                if(x==1){
                    ans+=temp*a;
                    x=-1;
                }else {
                    ans-=temp*b;
                    x=1;
                }

//                ans+=temp;

            }
        }
        System.out.println(ans);



    }
}
