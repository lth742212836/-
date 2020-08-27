package 主测试;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        if (arr[0] == 'A') {//从第一位开始
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == 'A' && arr[i + 1] == 'B') {
                    arr[i] = 'B';
                    arr[i + 1] = 'A';
                    i++;
                }
            }
        }else {//开头先与结尾做比较进行转换
            for (int i = 0; i < arr.length; i++) {
                if(i==0 && arr[arr.length-1]=='A'){
                    arr[0]='A';
                    arr[arr.length-1]='B';
                    continue;
                }
                if (arr[i] == 'A' && arr[i + 1] == 'B') {
                    arr[i] = 'B';
                    arr[i + 1] = 'A';
                    i++;
                }

            }
        }

        printf(arr);

    }




    static void printf(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
