package 主测试;

public class Main {

    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        for (int i = 100; i <=999 ; i++) {
            c=i%10;
            a=i/100;
            b=i%100/10;
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }

}