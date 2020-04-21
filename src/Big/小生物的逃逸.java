package Big;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 小生物的逃逸 {
	public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<ball> list =new ArrayList();
        for (int i =0;i<n;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int z=scanner.nextInt();
            int r= scanner.nextInt();
            ball ball =new ball(x, y, z,r);
            list.add(ball);
        }
        double lo= 0;
        int[]  d=new  int[m+1];
        for (int i =0;i<m;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int z=scanner.nextInt();
            int i1=0;
            for (int j =0;j<n;j++){
                lo =  Math.sqrt(Math.pow((x-list.get(j).getX()), 2)+Math.pow((y-list.get(j).getY()), 2)+Math.pow((z-list.get(j).getZ()), 2));
                if (lo<list.get(j).getR()){
                    i1++;
                }
            }
            d[i] =i1;
        }
        for (int i =0;i<m;i++){
            System.out.print(d[i]+ " ");
        }


    }
    static class ball{
        int x ;
        int y ;
        int z ;
        int r;
        public ball(int x, int y, int z, int r){
            this.x =x;
            this.y =y;
            this.z =z;
            this.r =r;
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
