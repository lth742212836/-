package Big;


import java.util.ArrayList;
import java.util.Scanner;

public class 自行车停放2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		list.add(sc.nextInt());
		for (int i = 1; i < n; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int k=sc.nextInt();
			if(k==1){
				for (int j = 0; j < list.size(); j++) {
					if(y==list.get(j)){
						list.add(j+1,x);
						break;
					}
				}
				
			}else{
				for (int j = 0; j < list.size(); j++) {
					if(y==list.get(j)){
						list.add(j,x);
						break;
					}
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}