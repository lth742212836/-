package 主测试;

public class Text3 {
    public static void main(String[] args) {

        StringBuilder arr=new StringBuilder("MydlroWHello");
        String order="Reverse 3 7";
        reverse(order,arr);
    }
    public static StringBuilder reverse(String order,StringBuilder arr){
        int whiteA=order.indexOf(" ",8);
        String number=order.substring(8,whiteA);//将第一个数字取出
        int a = Integer.parseInt(number);//将包含数字的字符串转化为数字

        number=order.substring(whiteA+1);//将第二个数字取出
        int b = Integer.parseInt(number);//将包含数字的字符串转化为数字

        StringBuilder change=new StringBuilder(arr.substring(a-1, b));//取出反转范围内的字符
        change.reverse();//反转
        StringBuilder temp1=new StringBuilder(arr.substring(0, a - 1));//取出反转范围之前的字符
        StringBuilder temp2=new StringBuilder(arr.substring(b, arr.length()));//取出反转范围之后的字符
        temp1.append(change).append(temp2);//拼接
        System.out.println(temp1);
        return arr;

    }
}
