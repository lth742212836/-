package 全排列;

//import org.lanqiao.algo.elementary._06_math.Case11_NExponent;

import java.util.*;

/**
 请编写一个方法，返回某集合的所有非空子集。

 给定一个int数组A和数组的大小int n，请返回A的所有非空子集。
 保证A的元素个数小于等于20，且元素互异。

 各子集内部从大到小排序,子集之间字典逆序排序
 */
public class 非空子集 {

  public static void main(String[] args) {
    int[] A = {1, 2, 3};
    非空子集 obj = new 非空子集();

    HashSet<HashSet<Integer>> subsets3 = obj.getSubsets3(A, A.length);
    System.out.println(subsets3);

//    HashSet<HashSet<Integer>> subsets2 = obj.getSubsets2(A, A.length);
//    System.out.println(subsets2);

//    ArrayList<ArrayList<Integer>> subsets = obj.getSubsets(A, A.length);
//    System.out.println(subsets);
  }

  /**
   * 二进制法,迭代法,或者逐步生成法
   * @param A
   * @param n
   * @return
   */
//  public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
//    Arrays.sort(A);//正序排序
//    ArrayList<ArrayList<Integer>> res = new ArrayList<>();//大集合
//
//    for (int i = Case11_NExponent.ex(2, n) - 1; i > 0; i--) {//大数字-1
//      ArrayList<Integer> s = new ArrayList<>();//对每个i建立一个集合
//      for (int j = n - 1; j >= 0; j--) {//检查哪个位上的二进制为1,从高位开始检查,高位对应着数组靠后的元素
//        if (((i >> j) & 1) == 1) {
//          s.add(A[j]);
//        }
//      }
//      res.add(s);
//    }
//    return res;
//  }

  /*逐步生成迭代大法*/
  public HashSet<HashSet<Integer>> getSubsets2(int[] A, int n) {
	  
	HashSet<HashSet<Integer>> res = new HashSet<HashSet<Integer>>();
//    Set<Set<Integer>> res = new HashSet<>();
	
    res.add(new HashSet<Integer>());//初始化为空集
    //从第一个元素开始处理
    for (int i = 0; i < n; i++) {
    	HashSet<HashSet<Integer>> res_new = new HashSet<HashSet<Integer>>();
//      Set<Set<Integer>> res_new = new HashSet<>();//新建一个大集合
      
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

  /**
   * 增量构造法
   * @param A
   * @param n
   * @return
   */
  public HashSet<HashSet<Integer>> getSubsets3(int[] A, int n) {
    // Arrays.sort(A);
    return getSubsets3Core(A, n, n - 1);

  }

  /**
   * 递归增量构造法
   * @param A
   * @param n
   * @param cur
   * @return
   */
  private HashSet<HashSet<Integer>> getSubsets3Core(int[] A, int n, int cur) {
    HashSet<HashSet<Integer>> newSet = new HashSet<HashSet<Integer>>();
    if (cur == 0) {//处理第一个元素
      HashSet<Integer> nil = new HashSet<Integer>();//空集
      HashSet<Integer> first = new HashSet<Integer>();//包含第一个元素的集合
      first.add(A[0]);
      newSet.add(nil);
      newSet.add(first);
      return newSet;
    }

    HashSet<HashSet<Integer>> oldSet = getSubsets3Core(A, n, cur - 1);
    for (Set<Integer> set : oldSet) {
      //对于每个子集,cur这个元素可以加进去,也可以不加进去
      newSet.add((HashSet<Integer>) set);//保留原样
      Set<Integer> clone = (Set<Integer>) ((HashSet) set).clone();
      clone.add(A[cur]);//添加当前元素
      newSet.add((HashSet<Integer>) clone);
    }
    return newSet;
  }
}
