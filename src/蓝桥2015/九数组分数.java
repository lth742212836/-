package 蓝桥2015;

public class 九数组分数 {
    public static void test(int[] x) {
        int a = x[0] * 1000 + x[1] * 100 + x[2] * 10 + x[3];
        int b = x[4] * 10000 + x[5] * 1000 + x[6] * 100 + x[7] * 10 + x[8];
        if (a * 3 == b) System.out.println(a + " " + b);
    }

    public static void swap(int[] x, int k, int i) {
        int t = x[k];
        x[k] = x[i];
        x[i] = t;
    }

    public static void f(int[] x, int k) {
        if (k >= x.length) {
            System.out.println("排列为");
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
//            test(x);
            return;
        }

        for (int i = k; i < x.length; i++) {
            swap(x, i, k);
            f(x, k + 1);
            swap(x, i, k);
        }
//        for (int i = k; i < x.length; i++) {
//            {
//                int t = x[k];
//                x[k] = x[i];
//                x[i] = t;
//            }
//            f(x, k + 1);
//            {
//                int t = x[k];
//                x[k] = x[i];
//                x[i] = t;
//            }
//        }
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        f(x, 0);
    }

}
