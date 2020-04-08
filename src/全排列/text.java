package 全排列;

import java.util.ArrayList;
import java.util.Arrays;

public class text {
	static ArrayList<String> res = new ArrayList<String>();
	public static void main(String[] args) {
		String s="hello";
		char[] arr=s.toCharArray();
//		Arrays.sort(arr);
		run(0,arr);
		System.out.println(res);
		
		
	}
	public static void run(int k,char[] arr){
		if(k==arr.length){
//			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i]);
//			}
//			System.out.println();
			res.add(new String(arr));
		}
		for (int i = k; i < arr.length; i++) {
			swap(arr, k, i);//把后面每个字符换到k位
			
			run(k+1,arr);
			
			swap(arr, k, i);//把后面每个字符换到k位
		}
	}
	public static void swap(char[] arr, int i, int j) {
	    char tmp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = tmp;
	  }
}
