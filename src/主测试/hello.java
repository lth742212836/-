package 主测试;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		
	}
	public static void text17(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] s=new int[n];
		
		int sum=0;
		for (int i = 0; i < n; i++) {
			s[i]=sc.nextInt();
		}
		Arrays.sort(s);
		int j=0;
		while(j!=n-1) {
			sum=sum+s[j]+s[j+1];
			s[j+1]=s[j+1]+s[j];
			s[j]=0;
			Arrays.sort(s);
			j++;
			
		}
		System.out.println(sum);
	}
	public static void text16(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		BigInteger bg = new BigInteger("1");
		for(int i=1;i<=a;i++){
//			String n = String.valueOf(i);
			bg = (new BigInteger(String.valueOf(i))).multiply(bg);
		}
		System.out.println(bg);
	}
	public static void text15(){
		Scanner sc=new Scanner(System.in);
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		double a1=sc.nextDouble();
		double b1=sc.nextDouble();
		double a2=sc.nextDouble();
		double b2=sc.nextDouble();
		
		double xmax=Math.max(x1,x2);
		double xmin=Math.min(x1,x2);
		double ymax=Math.max(y1,y2);
		double ymin=Math.min(y1,y2);
		
		double amax=Math.max(a1,a2);
		double amin=Math.min(a1,a2);
		double bmax=Math.max(b1,b2);
		double bmin=Math.min(b1,b2);
		
		if(amin>=xmax || xmin>=amax || bmin>=ymax || ymin>=bmax){
			System.out.println("0.00");
		}else{
			double m=Math.min(xmax,amax);
			double n=Math.min(ymax,bmax);
			double mm=Math.max(xmin,amin);
			double nn=Math.max(ymin,bmin);
			double result=Math.abs(m-mm)*Math.abs(n-nn);
			
			System.out.printf("%.2f\n",result);
		}
	}
	public static void text14(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String re=Integer.toHexString(n).toUpperCase();
		System.out.println(re);
	}
	public static void text13(){
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		long sum=0;
		char[] s=n.toCharArray();
		char[] all={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int a=s.length;
		for(int i=0;i<a;i++){//遍历字符组
			for(int j=0;j<all.length;j++){//挨个比较
				if(all[j]==s[i]){
					sum=(long) (sum+(j)*Math.pow(16, a-i-1));
				}
			}
		}
		System.out.println(sum);
	}
	public static void text12(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		
		int temp;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1; j++) {
				if(a[j+1]<=a[j]){
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]);
			if(i!=a.length-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	public static void text11(){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		int h=0,m=0,s=0;
		s=t%60;
		m=(t-s)/60;
		if(m>=60){
			h=h+m/60;
			m=m%60;
		}
		System.out.println(h+":"+m+":"+s);
		
	}
	public static void text10(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] all={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		char[] re=new char[22];
		if(n==0){
			System.out.println(0);
		}
		int i=0;
		if(n>0){
			while(n>0){
				re[i]=all[n%16];
				n=n/16;
				i++;
			}
		}
		for (int j =  i-1; j >=0; j--) {
			System.out.print(re[j]);
		}
	}
	public static void text9(){
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=9999;i<=99999;i++){
			a=i%10;//个位
			b=i%100/10;//十位
			c=i%1000/100;//百位
			d=i/1000%10;//千位
			e=i/10000;
			if(n==a+b+c+d+e){
				if(a==e && b==d ){
					System.out.println(i);
				}
			}
		}
		for(int i=99999;i<=999999;i++){
			a=i%10;//个位
			b=i%100/10;//十位
			c=i%1000/100;//百位
			d=i%10000/1000;//千位
			e=i/10000%10;//万位
			f=i/100000;//十万
			if(n==a+b+c+d+e+f){
				if(a==f && b==e && c==d){
					System.out.println(i);
				}
			}
		}
	}
	public static void text3(){
		 for(int i = 0;i < 2 ;i++){
	            for(int j = 0;j < 2 ;j++){
	                for(int k = 0;k < 2;k++){
	                    for(int m = 0;m < 2;m++){
	                        for(int n = 0;n < 2 ;n++){
	                            System.out.println(i+""+j+""+k+""+m+""+n);
	                        }
	                    }
	                }
	            }
	        }
	}
	public static void text4(){
		int[] s=new int[2];
		s[0]=0;
		s[1]=1;
		for(int a=0;a<=1;a++){
			for(int b=0;b<=1;b++){
				for(int c=0;c<=1;c++){
					for(int d=0;d<=1;d++){
						for(int e=0;e<=1;e++){
							System.out.println(s[a]+""+s[b]+""+s[c]+""+s[d]+""+s[e]);
						}
					}
				}
			}
		}
	}
	public static void text5(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int F[] = new int[n+2];
		F[1]=1;
		F[2]=1;
		if(n>2){
			for(int i=3;i<=n;i++){
				F[i]=(F[i-1]+F[i-2])%10007;
			}
		}
		System.out.println(F[n]);
	}
	public static void text6(){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char[] chars={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				char s=chars[Math.abs(i-j)];
				System.out.print(s);
			}
			System.out.println();
		}
	}
	public static void text7(){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] ars=new int[a];
		for(int i=0;i<a;i++){
			ars[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		int n=-1;
		int cs=0;
		for(int i=0;i<a;i++){
			if(t==ars[i]){
				cs=i+1;
				n=1;
				break;
			}
			
		}
		if(n==-1){
			System.out.println(n);
		}else{
			System.out.println(cs);
		}
	}
	public static void text8(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][] ars=new int[n][n];
		if(n>=1){
			ars[0][0]=1;
		}
		if(n>=2){
			ars[0][0]=1;
			ars[1][0]=1;
			ars[1][1]=1;
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				if(j==0 || j==i){
					ars[i][j]=1;
				}else{
					ars[i][j]=ars[i-1][j-1]+ars[i-1][j];
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
					System.out.print(ars[i][j]);
					if(j!=i){
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void text2(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a=1;
		if(n%4==0 && n%100!=0){
			a=-1;
		}
		if(n%400==0){
			a=-1;
		}
		if(a==1){
			System.out.println("no");
		}else{
			System.out.println("yes");
		}
	}
	public static void text1(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++){
			int x=-1;
			int a=i;
			while(a>0){
				int k=a%10;
				if(k==2 || k==0 || k==1 ||k==9){
					x=1;
				}
				a=a/10;
			}
			if(x==1){
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}

	
}
