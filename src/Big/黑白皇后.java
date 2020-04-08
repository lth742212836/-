package Big;

import java.util.Scanner;

public class 黑白皇后 { 
	static int count=0;
	static int n;
	static int[][] s;
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				s[i][j]=sc.nextInt();
			}
		}
		
		insert(0,2);//2为黑，3为白
		System.out.println(count);
	}
	public static void insert(int k,int t) {//k为行数，t为皇后类型
		if(k==n){
			if(t==2){
				insert(0,3);
			}else{
				count++;
			}
			return ;
		}
		for(int i=0;i<n;i++){
			if(s[k][i]!=1){
				continue;
			}
			if(check(k,i,t)){
				s[k][i]=t;
			}else{
				continue;
			}
			insert(k+1,t);
			s[k][i]=1;
		}
		return ;
	}
	public static boolean check(int k,int i,int t){
	 for(int q=k-1;q>=0;q--)                      //当前位置上方是否进行了相同皇后的放置 这行以下的还没放不检查  
        {  
            if(s[q][i]==t)return false;  
        }         
        for(int q=k-1,w=i-1;q>=0&&w>=0;q--,w--)      //检查左对角线 这行以下的还没放不检查  
        {  
            if(s[q][w]==t)return false;  
        }  
        for(int q=k-1,w=i+1;q>=0&&w<=n-1;q--,w++)    //检查右对角线 这行以下的还没放不检查  
        {  
            if(s[q][w]==t)return false;  
        }  
		return true;
	}
	
}
