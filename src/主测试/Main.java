package 主测试;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node p[] =new Node[n];
        for (int i = 0; i < n; i++) {
            int left=sc.nextInt();
            int right=sc.nextInt();
            int value=sc.nextInt();
            p[i]=new Node(left,right,value);
        }

        Arrays.sort(p, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.right>o2.right)
                    return 1;
                else if(o1.right<o2.right)
                    return -1;
                else
                    return 0;
            }
        });

        for (Node node :
                p) {
            System.out.println(node);
        }
        System.out.println("========");
        System.out.println(p[0]);

    }


}
class Node{
    int left;
    int right;
    int value;

    public Node(int left, int right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
