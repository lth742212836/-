package 主测试;

import java.util.HashMap;

public class Text {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        hashMap.put("hello",1);
        hashMap.put("hello",1);
        System.out.println(hashMap);
        Integer hello = hashMap.get("hello");
        hello++;
        System.out.println(hashMap);
    }
}
