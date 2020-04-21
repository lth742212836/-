package 子串;

public class 子串3 {//所有的（貌似不对）
    public static void printAllSub(char[] str,int i,String res) {
        if(i==str.length) {
            System.out.println(res);
            return;
        }
        printAllSub(str, i+1, res);//忽略当前字符
        printAllSub(str, i+1, res+String.valueOf(str[i]));//打印当前字符
    }
    public static void main(String[] args) {
        String aString="abc";
        printAllSub(aString.toCharArray(),0,"");
    }
}
