package 子串;

public class 子串1 {//暴力法
    public static void main(String[] args) {
        String str = "abbc";
        show(str);
    }
    public static void show( String str){
        for(int i = 0; i < str.length(); i++){
            for (int j = i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));

            }
        }
    }
}