package Big;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class 出现次数最多数2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println();
            return;
        }
        int arr[] = new int[n];
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int number = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == list.get(i)) {
                    number++;
                }
            }
            map.put(list.get(i), number);
        }
        Set<Integer> set = map.keySet();

        int max = 0;
        int index = 0;
        for (int i : set) {
//System.out.println(i+":"+map.get(i));
            if (map.get(i) > max) {
                max = map.get(i);
                index = i;
            }
        }
        System.out.println(index);

    }

}