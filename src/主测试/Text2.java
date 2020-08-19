package 主测试;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String arr= scanner.next();
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        switch (arr){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                break;
        }
    }

}
