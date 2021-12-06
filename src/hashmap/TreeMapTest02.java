package hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest02 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"甜心1");
        treeMap.put(2,"甜心2");
        treeMap.put(3,"甜心3");
        treeMap.put(4,"甜心4");
       //  treeMap.put(4"甜心4"); // 自动去重，如果值和原来的不同，那么会覆盖掉旧值
        System.out.println(treeMap);

        for (Map.Entry<Integer,String>m : treeMap.entrySet()) {
            System.out.println(m);
        }

        for (Integer key : treeMap.keySet()) {
            System.out.println(key +"=" + treeMap.get(key));
        }
        for (String value : treeMap.values()) {
            System.out.println(value + "\t");

        }

        // 由于treepMap键有序，而特别拥有的方法
        System.out.println("firstKey" + treeMap.firstKey());
        System.out.println("firstEntry" + treeMap.firstEntry());
        System.out.println("lastKey" + treeMap.lastKey());
        System.out.println("lastEntry" + treeMap.lastEntry());
    }
}
