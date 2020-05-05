package 主测试;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int i = sc.nextInt();
        int[] pkind = new int[p];
        int[] ikind = new int[i];
        int[] pkind2 = new int[p];
        int[] ikind2 = new int[i];
        for (int j = 0; j < p; j++) {
            pkind[j] = sc.nextInt();
            pkind2[j]=pkind[j];
        }
        for (int j = 0; j < i; j++) {
            ikind[j] = sc.nextInt();
            ikind2[j]=ikind[j];
        }
        double[][] price = new double[p][i];
        double[][] price2 = new double[p][i];
        for (int j = 0; j < p; j++) {
            for (int k = 0; k < i; k++) {
                price[j][k] = sc.nextDouble();
                price2[j][k]=price[j][k];
            }
        }

        double allMin = 0;
        while (checkKind(pkind, ikind) == false) {
            double minPrice = findMinPrice(price);
            int x = 0;
            int y = 0;

            boolean temp = false;
            //找到最低价格的坐标
            for (int j = 0; j < price.length; j++) {
                for (int k = 0; k < price[j].length; k++) {
                    if (minPrice == price[j][k]) {
                        x = j;
                        y = k;
                        temp = true;
                        break;
                    }
                }
                if (temp == true) {
                    break;
                }
            }
            price[x][y] = -1.0;
            if (pkind[x] == 0 || ikind[y] == 0) {
                continue;
            }

            //计算价格
            int min = Integer.min(pkind[x], ikind[y]);
            allMin += minPrice * min;
            pkind[x] = pkind[x] - min;
            ikind[y] = ikind[y] - min;
        }

        double allMax = 0;
        while (checkKind(pkind2, ikind2) == false) {
            double maxPrice = findMaxPrice(price2);
            int x = 0;
            int y = 0;

            boolean temp = false;
            //找到最高价格的坐标
            for (int j = 0; j < price2.length; j++) {
                for (int k = 0; k < price2[j].length; k++) {
                    if (maxPrice == price2[j][k]) {
                        x = j;
                        y = k;
                        temp = true;
                        break;
                    }
                }
                if (temp == true) {
                    break;
                }
            }
            price2[x][y] = -1.0;
            if (pkind2[x] == 0 || ikind2[y] == 0) {
                continue;
            }

            //计算价格
            int min = Integer.min(pkind2[x], ikind2[y]);
            allMax += maxPrice * min;
            pkind2[x] = pkind2[x] - min;
            ikind2[y] = ikind2[y] - min;
        }
        System.out.println(String.format("%.2f", allMin)+" to "+String.format("%.2f", allMax));

    }

    static boolean checkKind(int[] pkind, int[] ikind) {
        for (int i = 0; i < pkind.length; i++) {
            if (pkind[i] != 0) {
                return false;//false为还有余货
            }
        }
        for (int i = 0; i < ikind.length; i++) {
            if (ikind[i] != 0) {
                return false;//false为还有余货
            }
        }
        return true;
    }

    //寻找最低价格
    static double findMinPrice(double[][] price) {
        double minPrice = 0;
        int temp = -1;
        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price[i].length; j++) {
                if (price[i][j] != -1 || price[i][j] != -1.0) {
                    minPrice = price[i][j];
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
                if (price[i][j] < minPrice && price[i][j] > 0) {
                    minPrice = price[i][j];
                }
            }
        }
        return minPrice;
    }
    //寻找最高价格
    static double findMaxPrice(double[][] price) {
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
        return maxPrice;
    }

}
/*
    问题描述
    　　Hugh Samston经营着一个为今年的ICPC世界总决赛的参与者提供甜点的餐饮服务。他将会提供上面有冰激凌的饼片。为了满足不同的需求，他准备了许多不同的饼片和冰激凌。
    　　Hugh希望以一份饼片上一份冰激凌的方式来提供甜点。然而，作为一个商人，他希望能赚到尽可能多的钱。他知道不同种类的饼片和冰激凌组合的价格，也知道那些冰激凌和那些饼片不能组合在一起。
    　　Hugh想根据每种饼片和冰激凌的数量，以及之前提到的不同组合的情况，确定他能获得的利润的范围。
    输入格式
    　　测试数据的输入一定会满足的格式。
    　　输入的第一行包含两个整数P, I，分别表示饼片和冰激凌的种类数。
    　　接下来一行包含P个整数，表示每种类型饼片的数量。
    　　接下来一行包含I个整数，表示每种类型冰激凌的数量。
    　　接下来P行，每行包含I个实数，表示每种类型饼片和冰激凌组合的结果。
    　　如果这种饼片和这种冰激凌可以组合，则为一个(0,10)的实数，表示这种组合的收益。
    　　否则，则为-1,表示这两种之间不能组合。
    输出格式
    　　输出一行，以"(最小收益) to (最大收益)"的方式输出利润的范围。

    　　请注意：所有的饼片和冰激凌都必须用完。
    样例输入
        2 3
        40 50
        27 30 33
        1.11 1.27 0.70
        -1 2 0.34
    样例输出
        91.70 to 105.87
    数据规模和约定
    　　0 < P,I <= 50，每种类型饼片或冰激凌数量不超过100。
 */