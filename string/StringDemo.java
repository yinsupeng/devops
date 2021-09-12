package string;

import java.util.*;

/**
 * @author spyin
 * @title: StringDemo
 * @projectName MyEnumm
 * @description: TODO
 * @date 2021/8/1419:52
 */
public class StringDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        for (int i = 0;i<num.size();i++){
//            System.out.println(num.get(i));
//        }
//        for (Integer i : num){
//            System.out.println(i);
//        }
//        Iterator<Integer> it =  num.iterator();
//        while (it.hasNext()){
//            Integer next = it.next();
//            System.out.println(next);
//        }
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        System.out.println(set);
//        for (Integer i :set){
//            System.out.println(i);
//        }
//        HashMap<String, Integer> map = new HashMap<>();
//        Collection<Integer> values = map.values();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"哈哈");
        map.put(2,"呵呵");
        Set<Integer> set = map.keySet();
        for(Integer i : set){
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (<Map.Entry<Integer, String>> entry : entries){

        }
    }
}
