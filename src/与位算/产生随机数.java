package 与位算;

import java.util.Random;

public class 产生随机数 {

	public static void main(String[] args) {

		int a;
		int b=100;
		Random rand=new Random();
		a=rand.nextInt(b);
		System.out.println(a);
	}

}
