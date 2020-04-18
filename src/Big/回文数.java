package Big;

import java.util.Scanner;

public class 回文数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 进制
		String m = sc.next();// 数字
		int[] a = new int[10001];
		int[] b = new int[10001];
		int l = m.length();
		for (int i = 0; i < l; i++) {
			if (m.charAt(i) >= '0' && m.charAt(i) <= '9') {
				a[i] = m.charAt(i) - '0';
			} else {
				if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z') {
					a[i] = m.charAt(i) - 'A' + 10;
				}else{
					a[i] = m.charAt(i) - 'a' + 10;
				}
			}
		}
		int count=0;
		while(true){
			if(count>30){
				break;
			}
			if(check(l,a)){
				break;
			}
			for (int i = 0; i < l; i++) {
                b[i]=a[l-i-1];
            }
            for (int i = 0; i < l; i++) {
                a[i]+=b[i];
            }
            for (int i = 0; i < l; i++) {
				a[i+1]+=a[i]/n;
				a[i]=a[i]%n;
			}
            if(a[l]>0){
            	l++;
            }
            count++;
		}
		if(count<=30){
			System.out.print("STEP=" + count);
		}else{
			System.out.println("Impossible!");
		}
		
	}
	public static boolean check(int l,int[] a){
		for (int i = 0; i < l; i++) {
            if(a[i]!=a[l-1-i])
                return false;
        }
        return true;
	}
}