package 蓝桥2019;


public class 数的分解 {
	public static void main(String[] args) {
		int num=0;
		String s1=null;
		String s2=null;
		String s3=null;
		for (int i = 1; i <2019; i++) {
			s1=String.valueOf(i);
			if(s1.contains("2") || s1.contains("4")){
				continue;
			}
			for (int j = i+1; j < 2019; j++) {
				
				s2=String.valueOf(j);
				if(s2.contains("2") || s2.contains("4")){
					continue;
				}
				for (int k = j+1; k < 2019; k++) {
					s3=String.valueOf(k);
					if(s3.contains("2") || s3.contains("4")){
						continue;
					}
					if(i+j+k==2019){
						num++;
					}
				}
			}
		}
		System.out.println(num);
		
	}
}
