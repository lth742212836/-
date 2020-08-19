package 全排列;

public class Dfs1 {
    static int sum=0;
    public static void main(String[] args) {
        int[] arr={1,2,13};
        f(arr,0);
        System.out.println(sum);
    }
	
	 public static boolean check(int[] arr) {
		 return false;
	 }
	public static void f(int[] arr, int n) {
        // 全排列经典代码
        if (n == arr.length) {
            sum++;
            return;
        }

        for (int i = n; i < arr.length; i++) {
            int temp = arr[i];//排列
            arr[i] = arr[n];
            arr[n] = temp;

            f(arr, n + 1);//递归

            temp = arr[i];//回溯
            arr[i] = arr[n];
            arr[n] = temp;
        }

    }


/*	dfs框架
	 public static boolean check(int[] arr) {
		 return false;
	 }
	public static void f(int[] arr, int n) {
        // 全排列经典代码
        if (n == arr.length) {
            if (check(arr)) {
            }
            return;
        }

        for (int i = n; i < arr.length; i++) {
            int temp = arr[i];//排列
            arr[i] = arr[n];
            arr[n] = temp;

            f(arr, n + 1);//递归

            temp = arr[i];//回溯
            arr[i] = arr[n];
            arr[n] = temp;
        }

    }

*/

}
