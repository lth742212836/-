package Big;

import java.util.Scanner;

public class 时间切换 { 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		String hour[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
                "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","thirty","forty","fifty"};
		String hour2[]={"","","twenty","thirty","forty","fifty"};
		String str1="";
		String str2="";
		
		if(m==0){
			str1=hour[h]+" o'clock";
		}else{
			if(m!=0){
				
				if(h>20){
					str1=hour[20]+" "+hour[h%10];
				}else{
					str1=hour[h];
				}
				if(m>20){
					str2=hour2[m/10]+" "+hour[m%10];
				}else{
					str2=hour[m];
				}
			}
		}
		System.out.println(str1+" "+str2);
	}
}
