package Big;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class 集合运算 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x=new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i]=sc.nextInt();
		} 
		int m = sc.nextInt();
		int[] y=new int[m];
		for (int i = 0; i < y.length; i++) {
			y[i]=sc.nextInt();
		}
		HashSet<Integer> hash=new HashSet<Integer>();//幷集
		HashSet<Integer> common=new HashSet<Integer>();//交集
		HashSet<Integer> down=new HashSet<Integer>();//余集
//		for (int i = 0; i < x.length; i++) {
//			hash.add(x[i]);
//		}
//		for (int i = 0; i < y.length; i++) {
//			hash.add(y[i]);
//		}
		
		for (int i = 0; i < x.length; i++) {
			int temp=-1;
			for (int j = 0; j < y.length; j++) {
				if(x[i]==y[j]){
					common.add(x[i]);
					temp=1;
				}
				
				hash.add(y[j]);
			}
			if(temp==-1){
				down.add(x[i]);
			}
			hash.add(x[i]);
			
		}
		Object[] result1 =common.toArray();
		Arrays.sort(result1);
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i]+" ");
		}
		
		
		System.out.println();
		Object[] result2 =hash.toArray();
		Arrays.sort(result2);
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i]+" ");
		}
		
		
		System.out.println();
		Object[] result3 =down.toArray();
		Arrays.sort(result3);
		for (int i = 0; i < result3.length; i++) {
			System.out.print(result3[i]+" ");
		}
		
		
//		System.out.println(common);
//		System.out.println("=========");
//		System.out.println(hash);
		
	}
}