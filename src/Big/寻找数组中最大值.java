package Big;

import java.util.Scanner;

public class 寻找数组中最大值 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        int temp=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
                temp=i;
            }
        }
        System.out.println(max+" "+temp);
    }
}
