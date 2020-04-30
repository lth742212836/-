package 主测试;

import java.util.ArrayList;
import java.util.List;

public class hello {
    public static void main(String[] args) {
		List<String> lists=new ArrayList<>();
		lists.add("hello");
		lists.add("world");
		lists.add("china");
		for (String str : lists) {
			System.out.println(str);
		}
    }
}
