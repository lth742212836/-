package 全排列;

import java.util.HashSet;
import java.util.Set;

public class 子集 {
	public static void main(String[] args) {
		int[] A = {1, 2, 3,4,5,6,7,7};
		HashSet<HashSet<Integer>> set=run(A,A.length,A.length-1);
		HashSet<HashSet<Integer>> set2=getSubsets2(A,A.length);
		System.out.println(set);
		System.out.println(set2);
		
	}
	
	//递归
	public static HashSet<HashSet<Integer>> run(int[] A, int n, int cur){
		HashSet<HashSet<Integer>> set_new=new HashSet<HashSet<Integer>>();
		
		if(cur==0){
			HashSet<Integer> no=new HashSet<Integer>();//空集
			HashSet<Integer> yes=new HashSet<Integer>();//包含第一个元素的集合
			yes.add(A[0]);
			set_new.add(no);
			set_new.add(yes);
			return set_new;
		}
		HashSet<HashSet<Integer>> set_old=run(A,n,cur-1);
		for (HashSet<Integer> set : set_old) {
			set_new.add(set);//保留原样
			HashSet<Integer> clone=(HashSet)set.clone();
			clone.add(A[cur]);
			set_new.add(clone);
		}
		return set_new;
		
	}
	
	
	
	/*逐步生成迭代大法*/
	  public static HashSet<HashSet<Integer>> getSubsets2(int[] A, int n) {
		  
		HashSet<HashSet<Integer>> res = new HashSet<HashSet<Integer>>();
//	    Set<Set<Integer>> res = new HashSet<>();
		
	    res.add(new HashSet<Integer>());//初始化为空集
	    //从第一个元素开始处理
	    for (int i = 0; i < n; i++) {
	    	HashSet<HashSet<Integer>> res_new = new HashSet<HashSet<Integer>>();
//	      Set<Set<Integer>> res_new = new HashSet<>();//新建一个大集合
	      
	      res_new.addAll(res);//把原来集合中的每个子集都加入到新集合中
	      //遍历之前的集合,全部克隆一遍
	      for (Set e : res) {
	        Set clone = (Set) ((HashSet) e).clone();
	        clone.add(A[i]);//把当前元素加进去
	        res_new.add((HashSet<Integer>) clone);//把克隆的子集加到大集合中
	      }
	      res = res_new;
	    }
	    return res;
	  }
}
