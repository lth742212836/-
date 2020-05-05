package 主测试;

public class hello {
    public static void main(String[] args) {
        double[][] price = new double[2][3];
        price[0]= new double[]{-1, -1, -1};
        price[1]= new double[]{-1,-1,-1};
        double maxPrice = 0;
        int temp = -1;
        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price[i].length; j++) {
                if (price[i][j] != -1 || price[i][j] != -1.0) {
                    maxPrice = price[i][j];
                    temp = 1;
                    break;
                }
            }
            if (temp == 1) {
                break;
            }
        }
        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price[i].length; j++) {
                if (price[i][j] == -1 || price[i][j] == -1.0) {
                    continue;
                }
                if (price[i][j] > maxPrice && price[i][j] > 0) {
                    maxPrice = price[i][j];
                }
            }
        }
        System.out.println(maxPrice);


    }
}
