package Big;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 小生物的逃逸 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<ball> list = new ArrayList();
        //创建球的实体类，并加入到list中
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int r = scanner.nextInt();
            ball ball = new ball(x, y, z, r);
            list.add(ball);
        }
        double lo = 0;
        int[] d = new int[m + 1];
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int i1 = 0;
            //对质点到每个球的圆心的距离d的判断，假如d的值小于球体的半径r那么这个质点一定球体的内部
            for (int j = 0; j < n; j++) {
                lo = Math.sqrt(Math.pow((x - list.get(j).getX()), 2) + Math.pow((y - list.get(j).getY()), 2) + Math.pow((z - list.get(j).getZ()), 2));
                if (lo < list.get(j).getR()) {
                    i1++;
                }
            }
            d[i] = i1;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(d[i] + " ");
        }


    }

    static class ball {
        int x;
        int y;
        int z;
        int r;

        public ball(int x, int y, int z, int r) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.r = r;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }

        public int getR() {
            return r;
        }
    }

}
/*
资源限制
时间限制：1.0s 内存限制：256.0MB
问题描述
　　空间中有n个球，这些球不相交也不相切。有m个可以视为质点的小生物，可能在某些球内，也可能在所有球之外，但不会在球面上。问这些生物从原来的地方逃逸到所有球外面的空间，至少要经过多少层球面。
输入格式
　　第一行两个数n、m：表示球的数量和小生物的数量；
　　接下来n行每行四个整数Xi、Yi、Zi和Ri：表示一个球的三维坐标和半径；
　　接下来m行每行三个整数Xi、Yi、Zi：表示一个生物的坐标。
输出格式
　　一行m个数：表示每个小生物逃逸时至少经过的球面数。
样例输入
    2 2
    0 0 0 2
    0 0 0 4
    0 0 1
    0 0 3
样例输出
    2 1
数据规模和约定
　　1<=n、m<=100，|Xi|、|Yi|、|Zi|<=10000，1<=Ri<=10000；
　　数据保证所有球严格不接触，小生物都不在球面上。
 */