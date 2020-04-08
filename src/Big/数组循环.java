package Big;
import java.util.Scanner;

public class 数组循环 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//接收输入
		int m=sc.nextInt();           
		int n=sc.nextInt(); 
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}   
			
		//定义二维数组的索引,总数
		int count=0;
		//
		int length_L = 0,length_R = 0,length_m = m,length_n = n;
		while(true){
			//此时认为全部找完了.跳出循环
			if(count == m * n){
				break;
			}
			//四个while,分别输出于第一列,最后一行,最后一列,第一行,,,这样就完成了一圈,然后依靠外层循环,来找下一圈,
			//已经输出的数标记为-1,避免重复使用
			int x= length_L,y= length_R;
			while(true){
				if(arr[x][y] != -1){
					System.out.print(arr[x][y] + " ");
					arr[x][y] = -1;
					count++;
					if(x < length_m-1)
						x++;
					else
						break;
				}
			}
			//System.out.println("-----------");			
			while(true){
				if(arr[x][y] != -1){
					System.out.print(arr[x][y] + " ");
					arr[x][y] = -1;	
					count++;
				}
				if(y < length_n-1)
					y++;
				else
					break;
			}
			//System.out.println("-----------");			
			while(true){
				//System.out.println(x+" " + y+"..");
				if(arr[x][y] != -1){
					System.out.print(arr[x][y] + " ");
					count++;
					arr[x][y] = -1;		
				}
				if(x > length_L)
					x--;
				else
					break;
			}
			//System.out.println("-----------");
			while(true){
				//System.out.println(x+" " + y+"..");
				if(arr[x][y] != -1){
					System.out.print(arr[x][y] + " ");
					count++;					
				}
				if(y > length_R)
					y--;
				else
					break;
			}
			//找完外圈,减少范围
			length_L++;length_R++;
			length_m--;length_n--;
		}		
	}

}

