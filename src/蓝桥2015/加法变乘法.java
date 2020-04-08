package 蓝桥2015;

public class 加法变乘法 {
	public static void main(String[] args) {
		int sum=0;
		for (int j = 1; j <= 49; j++) {
			sum+=j;
		}
//		System.out.println(sum);
		for (int i = 1; i <=46; i++) {
			for (int j = i+2; j <=48; j++) {
				int x1=i+i+1;
				int y1=i*(i+1);
				int x2=j+j+1;
				int y2=j*(j+1);
				if(	(sum-x1+y1-x2+y2)==2015	){
					System.out.println(i);
				}
			}
			
		}
		
	}

}
