package 蓝桥2015;

public class 牌型种数 {
    static int count=0;
    public static void main(String[] args) {
        dfs(0,0);
        System.out.println(count);
    }
    public static void dfs(int cnt,int sum){
        if(cnt>13 || sum>13){
            return;
        }
        if(cnt==13 && sum==13){
            count++;
        }
        for (int i = 0; i < 5; i++) {
            dfs(cnt+i,sum+1);
        }
    }
}
