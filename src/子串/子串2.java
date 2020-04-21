package 子串;

public class 子串2 {//递归
    public static void main(String[] args) {
        generate("abbc");
    }

    public static void generate(String arr) {
        if (arr.length() == 1) {
            System.out.println(arr);
            return;
        }else{
            System.out.println(arr);
            generate(arr.substring(0, arr.length()-1));
            generate(arr.substring(1, arr.length()));
        }

    }

}
