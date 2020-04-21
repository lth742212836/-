package 主测试;

import java.util.HashMap;
import java.util.Map;

public class Text {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("hello",1);
		System.out.println(map);
		map.put("hello",2);
		System.out.println(map);
	}
}
