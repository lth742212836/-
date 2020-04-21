package Big;

import java.util.*;
public class 自行车停放 {
    public static class Node{
        public int no;
        public Node left;
        public Node right;
        public Node(){};
        public Node(Node left,int no,Node right){
            this.left=left;
            this.right=right;
            this.no=no;
        }
        public Node(int no){
            this.no=no;
            this.left=new Node();
            this.right=new Node();
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        HashMap<Integer,Node> map=new HashMap<Integer,Node>();
        int n=sc.nextInt();//要停放的自行车数量
        int m=sc.nextInt();//第一辆车的编号

        Node first=new Node(m);
        map.put(m,first);
        for (int i=0;i<n-1;i++)
        {
            int x=sc.nextInt();//待放入车棚的自行车编号
            int y=sc.nextInt();//停放的自行车(参照物)
            int z=sc.nextInt();//0为左，1为右
            Node bikeY=map.get(y);//获取参照物节点
            if(z==0){
                Node add=new Node(bikeY.left,x,bikeY);
                bikeY.left.right=add;
                bikeY.left=add;
                if(add.left.no==0)
                    first=add;
                map.put(x,add);

            }
            else{
                Node add=new Node(bikeY,x,bikeY.right);
                bikeY.right.left=add;
                bikeY.right=add;
                if(add.left.no==0)
                    first=add;
                map.put(x,add);
            }

        }

        Node out=first;
        while (true) {
            System.out.print(out.no+" ");
            if(out.right.no!=0)
                out=out.right;
            else
                break;
        }

    }
}

