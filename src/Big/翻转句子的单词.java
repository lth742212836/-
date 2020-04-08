package Big;


public class 翻转句子的单词 {
	 public static void main(String[] args) {
		String s1="world hello china";
		String result=reverse(s1);
		System.out.println(result);
	}
	 //翻转字符串
	 static String reverseString(String str){
		 StringBuilder sb=new StringBuilder(str);
		 return sb.reverse().toString();
	 }
	 static String reverse(String s){
		String str=reverseString(s);
		String[] rs=str.split(" ");//以空格进行分割
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < rs.length; i++) {
			
			sb.append(		reverseString(rs[i])  +	" "	);
		}
		String result=sb.deleteCharAt(sb.length()-1).toString();
		 return result;
	 }
}

