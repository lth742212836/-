package 历届试题;

import java.util.Scanner;

public class 小数后第n位 {
	public static void main(String[] args) {
		long a, b, n;
		long sa, sn, count;
		Scanner in = new Scanner(System.in);
		a = in.nextLong();
		b = in.nextLong();
		n = in.nextLong();
		sn = n;
		sa = a % b; // 此时的sa*10对b取余后得到小数点后第一位
		count = 0;
		while (sn-- > 0) {
			if (sa == b) // 取余之后会等于零
				break;
			if (sa < b) {
				sa = sa * 10;
			} else {
				// 除法法则，逐步运算
				sa = sa % b;
				sa = sa * 10;
				if (sa == 0)
					break; // 后面都是零则直接跳出循环
 
			}
			count++;
			if (sa % b == a % b){ 
			// 减掉循环的数
				sn = n % count;
			}
		}
		if (sa == 0) {
			System.out.println("000");
		} else {
			int i = 3;
			while (i-- > 0) {
				System.out.print(sa / b); // 逐步输出n后三位的每一位
				sa = sa % b;
				sa = sa * 10;
			}
		}
	}

}