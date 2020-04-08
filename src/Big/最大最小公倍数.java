package Big;

import java.util.Scanner;
public class 最大最小公倍数 {
	public static void main(String[] args) { 
	    Scanner sc = new Scanner(System.in);  
	    long n = sc.nextInt();  
        long result; 
      	if(n==1 || n==2){
      		System.out.println(n);
      	}else{
      		if(n%2 != 0){  
            	result = n*(n-1)*(n-2);
	        	System.out.println(result);  
	      	}else{  
	          	if(n%3 != 0){
	            	result = n*(n-1)*(n-3);
	            	System.out.println(result);  
	        	}else{  
	              	result = (n-3)*(n-2)*(n-1);
	              	System.out.println(result);  
	            }  
	        }  
	    }
	}
}
