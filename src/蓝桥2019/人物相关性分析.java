package 蓝桥2019;

import java.util.Scanner;

public class 人物相关性分析 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		
		int num=0;//数量
		String[] words=str.split(" |\\.");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
//		System.out.println(words.length);
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals("Bob")){
				for (int j = i+1; j < words.length; j++) {
					int sum=1;
					if(words[j].equals("Alice")){
						for (int k = i+1; k < j; k++) {
							sum=sum+words[k].length()+1;
						}
						if(sum<=key){
							num++;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals("Alice")){
				for (int j = i+1; j < words.length; j++) {
					int sum=1;
					if(words[j].equals("Bob")){
						for (int k = i+1; k < j; k++) {
							sum=sum+words[k].length()+1;
						}
						if(sum<=key){
							num++;
						}
					}
				}
			}
		}
		System.out.println(num);
		
	}
}
