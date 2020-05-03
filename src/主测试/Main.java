package 主测试;

import java.io.*;

public class Main {
    static int l;
    static int n;
    static char[] s;
    static int ans = 0;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        l = Integer.parseInt(nm[0]);
        n = Integer.parseInt(nm[1]);
        s = br.readLine().toCharArray();
        // wr.write(Arrays.toString(s));
        len = s.length;
        dfs(0, 0, 0);
        //wr.write(ans+" ");
        //wr.write(" "+l+" "+n+" "+len);
        if (ans >= 2) {
            wr.write("NOT UNIQUE");
        } else if (ans == 1) {
            wr.write("YES");
        } else {
            wr.write("NO");
        }
        wr.close();
    }

    /*
        i为原串第几个字符
        num是变换后串的1累计个数
        curlen为变换后的串长
     */
    static void dfs(int i, int num, int curlen) {

        if (ans >= 2 || num > n || curlen > l) {
            return;
        }
        if (i >= len) {
            if (curlen == l && num == n) {//字符串的长度和1的个数正好匹配，答案+1
                ans++;
            }
            return;
        }
        if (s[i] == '0') {//如果这一位为0，那么不用考虑情况
            dfs(i + 1, num, curlen + 1);
            return;
        }
        if (i != 0 && s[i - 1] == '1') {
            dfs(i + 1, num + 1, curlen + 1);
            return;
        }
        dfs(i + 1, num + 1, curlen + 1);
        //注意，以上两种情况1均有可能代表压缩的情况，比如...0110.. 原串为...011110...压缩了3个1
        //下面的代码对每一个1均考虑其为压缩
        int tem = 0;
        for (int j = i; j < len; j++) {
            tem *= 2;
            tem += s[j] - '0';//上面两行代码实现二进制转十进制，就是解压缩后1的个数
            if (tem + num > n || tem + curlen > l) {
                break;//如果解压缩的编码长度或者1的个数比原来的大，不可行，返回
            }
            if (tem > j - i + 1 && (j + 1 == len || (j + 1 < len && s[j + 1] == '0'))) {
                //压缩的串1比原来多，并且下一个位置为0或者末尾，就是可行解，继续深搜
                dfs(j + 1, num + tem, tem + curlen);
            }
        }
/*
1000001001111111111111110011
1000001001111           0011
 */

    }
}
/*  c语言
    #include<stdio.h>
    #include<cstring>
    #define maxn 50
    int L,l,N;
    char data[maxn];
    int answer;

    void dfs(int i,int length,int num_1) {
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
        long long temp=0;
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


    int main()
    {
        scanf("%d",&L);		//原串长
        scanf("%d",&N);		//原来1的个数
        scanf("%s",data+1);
        l=strlen(data+1);		//新串长
        answer=0;
        dfs(1,0,0);
        if(answer==0)
            printf("NO");
        else if(answer==1)
            printf("YES");
        else
            printf("NOT UNIQUE");
        return 0;
    }
    原文链接：https://blog.csdn.net/Raymond_YP/article/details/104450936
 */
/*
    问题描述
    　　数据压缩的目的是为了减少存储和交换数据时出现的冗余。这增加了有效数据的比重并提高了传输速率。有一种压缩二进制串的方法是这样的：
    　　将连续的n个1替换为n的二进制表示（注：替换发生当且仅当这种替换减少了二进制串的总长度）
    　　（译者注：连续的n个1的左右必须是0或者是串的开头、结尾）
    　　比如：11111111001001111111111111110011会被压缩成10000010011110011。原串长为32,被压缩后串长为17.
    　　这种方法的弊端在于，有时候解压缩算法会得到不止一个可能的原串，使得我们无法确定原串究竟是什么。请你写一个程序来判定我们能否利用压缩后的信息来确定原串。给出原串长L，原串中1的个数N，以及压缩后的串。
    　　L<=16 Kbytes，压缩后的串长度<=40 bits。
    输入格式
    　　第一行两个整数L,N，含义同问题描述
    　　第二行一个二进制串，表示压缩后的串
    输出格式
    　　输出"YES"或"NO"或"NOT UNIQUE"（不包含引号）
    　　分别表示：
    　　YES：原串唯一
    　　NO：原串不存在
    　　NOT UNIQUE：原串存在但不唯一
        样例输入
        样例1：
        32 26
        10000010011110011
        样例2：
        9 7
        1010101
        样例3：
        14 14
        111111
        样例输出
        样例1：YES
        样例2：NOT UNIQUE
        样例3：NO
 */