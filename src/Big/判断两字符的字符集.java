package Big;

import java.util.HashMap;
import java.util.Map;

public class 判断两字符的字符集 {
	 
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello world";
		boolean res=check(s1,s2);
		System.out.println(res);
	}
	public static boolean check(String s1,String s2){
		Map< Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char a=s1.charAt(i);
			if(map.get(a)==null){
				map.put(a, 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			char a=s2.charAt(i);
			if(map.get(a)==null){
				return false;
			}
		}
		return true;
	}
}

