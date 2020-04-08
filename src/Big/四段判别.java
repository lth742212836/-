package Big;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class 四段判别 {
public static void main(String[] args) {
		
		List<Character> x = new ArrayList<Character>();
		List<Character> y = new ArrayList<Character>();
		for (char i = 'a'; i <= 'z'; i++) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				y.add(i);
			} 
        else {
				x.add(i);
			}
		}
		Scanner sc = new Scanner(System.in);
		String all = sc.next();
		int p = 0, a1 = 0, b2 = 0, c3 = 0, d4 = 0;
		while (p < all.length() && x.contains(all.charAt(p))) {
			a1 = 1;
			p++;
		}
		while (p < all.length()  && y.contains(all.charAt(p))) {
			b2 = 1;
			p++;
		}
		while (p < all.length()  && x.contains(all.charAt(p))) {
			c3 = 1;
			p++;
		}
		while (p < all.length() && y.contains(all.charAt(p))) {
			d4 = 1;
			p++;
		}
		if (p == all.length() && a1 == 1 && b2 == 1 && c3 == 1 && d4 == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}

