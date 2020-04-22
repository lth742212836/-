package 输出处理;


import java.util.Scanner;

public class 整型控制 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sex=sc.nextInt();
        double man=sc.nextDouble();
        double men=sc.nextDouble();
        double sum=0;
        if (sex==1){
            sum=(man+men)/2*1.08;
            System.out.printf("%.3f\n",sum);
        }else {
            sum=(man*0.923+men)/2;
            System.out.println(String.format("%.3f\n",sum));
//            System.out.printf("%.3f\n",sum);
        }
    }
}
