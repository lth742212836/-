package 主测试;

import java.util.ArrayList;


public class Text {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		System.out.println(list.get(0));
		list.add(0, 8);
		System.out.println(list);
	}
}
