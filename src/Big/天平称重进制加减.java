package Big;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 天平称重进制加减 {
	public static void main(String[] args) {
		System.out.println(Integer.toString(87,3));
	    Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    // m1(N);
	    //转成3进制
	    final String x = Integer.toString(N, 3);
	    //翻转后转成字符数组
	    char[] arr = new StringBuilder(x).reverse().toString().toCharArray();
	    System.out.println("arr[i]- '0'");
	    System.out.println(arr[0] - '0');
	    System.out.println(arr[1] - '0');
	    System.out.println(arr[2] - '0');
	    System.out.println(arr[3] - '0');
	    System.out.println(arr[4] - '0');
	    //容器放处理之后的0 -1 1
	    List<Integer> list = new ArrayList<Integer>();
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] == '2') {
	        list.add(0, -1);//-1插在开头
	        
	        if (i == arr.length - 1) {
	          list.add(0, 1);//最后一个字符,进位
	        } else {
	          ++arr[i + 1];//否则,对下一个数字加1
	        }
	        
	      }
	      else if (arr[i] == '3') {
	        list.add(0, 0);//插入0
	        //更高位进1
	        if (i == arr.length - 1) {
	          list.add(0, 1);
	        } else {
	          ++arr[i + 1];
	        }
	      } else {
	        list.add(0, arr[i] - '0');
	      }
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < list.size(); i++) {
	      if (list.get(i) == 1) sb.append("+").append((int) Math.pow(3, list.size() - i - 1));
	      if (list.get(i) == -1) sb.append("-").append((int) Math.pow(3, list.size() - i - 1));
	    }
	    System.out.println(sb.substring(1));
	  }
}

