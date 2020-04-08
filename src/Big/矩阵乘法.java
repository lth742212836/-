package Big;

import java.util.Scanner;

public class 矩阵乘法 {
    
    public void matrixMulti(long[][] A, long[][] B) {
        long[][] result = new long[A.length][B[0].length];
        for(int i = 0;i < A.length;i++) {
            for(int j = 0;j < B[0].length;j++) {
                for(int k = 0;k < A[0].length;k++)
                    result[i][j] += A[i][k] * B[k][j];
            }
        }
        for(int i = 0;i < A.length;i++) {
            for(int j = 0;j < B[0].length;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
        
        return;
    }
    
    public static void main(String[] args) {
        矩阵乘法 test = new 矩阵乘法();
        Scanner in = new Scanner(System.in);
        int ai = in.nextInt();
        int aj = in.nextInt();
        long[][] A = new long[ai][aj];
        for(int i = 0;i < ai;i++)
            for(int j = 0;j < aj;j++)
                A[i][j] = in.nextLong();
        int bi = in.nextInt();
        int bj = in.nextInt();
        long[][] B = new long[bi][bj];
        for(int i = 0;i < bi;i++)
            for(int j = 0;j < bj;j++)
                B[i][j] = in.nextLong();
        test.matrixMulti(A, B);
        
    }
}