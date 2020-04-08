package 主测试;

import java.util.Scanner;
public class Text {
	static int sum;
	static int n;
	static boolean pan=false;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		sum = sc.nextInt();
		int[] arr=new int[n];
		int[] view=new int[n];
		
		dfs(0,arr,view);
		
	}
	public static void dfs(int step,int[] arr,int[] view) {
		
		if(step==n){
			int sumte=0;
			int[] temp=new int[n];
			for(int i=0;i<n;i++){//复制原数组进行累加计算sum
				temp[i]=arr[i];
			}
			for (int j = 1; j <n; j++) {
				for (int i = 0; i < n-1; i++) {
					sumte+=arr[i];
				}
			}
			if(sumte==sum){
				for (int i = 0; i < n; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				//此时当前为最优解，所以可以return
				pan=true;
				return;
			}
			
			
		}
		
		if(pan==false){//判断是否找到解
			for (int i = 1; i <=n; i++) {
				if(view[i]==0){
					arr[i]=i;
					view[i]=1;
					
					dfs(step+1,arr,view);
					view[i]=0;
				}
			}
		}
		
		
	}
}
