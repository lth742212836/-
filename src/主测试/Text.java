package 主测试;

import java.util.Scanner;

public class Text {
    static int L;
    static int N;
    static int l;
    static char[] data;
    static int answer=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        L = Integer.parseInt(nm[0]);
        N=Integer.parseInt(nm[1]);
        data=sc.nextLine().toCharArray();

        l=data.length+1;
        answer=0;
        dfs(1,0,0);
        if (answer >= 2) {
            System.out.println("NOT UNIQUE");
        } else if (answer == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    static void dfs(int i,int length,int num_1) {
        //i是原串第i个字符，length是变换后的串长，num_1是变换后串的1累计个数
        if(i==l){		//最后一个位置
            dfs(i+1,length+1,num_1+data[i]-'0');
            return;		//最后一个位置是0的话data[i]-'0' =0  是1的话data[i]-'0'=1
        }
        if(i>l)	{	//结束条件
            if(length==L&&num_1==N)	//字符串的长度和1的个数正好匹配
                answer++;
            return;
        }

        if(length>L||num_1>N||answer>=2)	//不符合条件，提前返回
            return;

        if(data[i]=='0'){	//如果这一位为0，那么不用考虑情况
            dfs(i+1,length+1,num_1);
            return;
        }

        // 以下为 data[i]=='1' 的情况
        if(data[i-1]=='1')
            //即...11... 在处理上一个1或者更久之前已经考虑过了，注意看下面6行的代码
            return;

        //以下是data[i-1]=='0'的情况
        if(data[i+1]=='0')
            //即 ...010... 的情况，这种情况考虑的是1不压缩的情况
            dfs(i+1,length+1,num_1+1);
        if(data[i+1]=='1'&&data[i+2]!='1')
            //即 ...0110... 这种考虑的是不压缩的情况
            dfs(i+2,length+2,num_1+2);
        //注意，以上两种情况1均有可能代表压缩的情况，比如...0110.. 原串为...011110...压缩了3个1
        //下面的代码对每一个1均考虑其为压缩
        int temp=0;
        for(int j=i;j<=l;j++){
            temp*=2;
            temp+=data[j]-'0';
            //上面两行代码实现二进制转十进制，就是解压缩后1的个数
            if(temp+num_1>N||temp+length>L)
                //如果解压缩的编码长度或者1的个数比原来的大，不可行，返回
                break;
            if(temp>j-i+1&&data[j+1]!='1')
                //压缩的串1比原来多，并且下一个位置为0或者末尾，就是可行解，继续深搜
                dfs(j+1,temp+length,num_1+temp);
        }
    }
}
