package 与位算;

public class 快速幂 {
    public static void main(String[] args) {
        testPosition();
    }

    //位移快速求幂，求a的b次方
    public static void testPosition() {
        int a = 2;
        int b = 6;
        int r = 1;
        int base = a;
        while (b != 0) {
            if ((b & 1) != 0) {
                r *= base;
            }
            base *= base;
            b >>= 1;
        }
        System.out.println(a + "的" + b + "次方 = " + r);
    }
}
