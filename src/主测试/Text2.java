package 主测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text2 {
    public static void main(String[] args) {
        int sum=0;
        Integer[] arr=new Integer[3];
        List<Integer> list=new ArrayList<>();
        list.add(1);
//        list.add(2);
//        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(list.indexOf(4));
        System.out.println(list);






//        Object[] objects = list.toArray();
//        arr = Arrays.copyOfRange(objects, 0, objects.length,Integer[].class);
//        if(check(list)){
//            for (int i : list) {
//                System.out.print(i+" ");
//            }
//        }

//        System.out.println("总数是 "+sum);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

    }

    static boolean check(List<Integer> list){
        Object[] objects = list.toArray();
        Integer[] arr=new Integer[objects.length];
        arr = Arrays.copyOfRange(objects, 0, objects.length,Integer[].class);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[j]-arr[i])<=2){
                    return false;
                }
            }
        }
        return true;
    }

}
