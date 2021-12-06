package tools;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test05 {
    public static void main(String[] args) {
        TreeMap<String,String>tree = new TreeMap<>( new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);  // 按照字母排序
            }
        });
        tree.put("name","jack");
        tree.put("age","22");
        tree.put("high","166");
        tree.put("sex","nan");
        tree.put("weight","66kg");
        tree.put("aaa","33");
        tree.put("abc","77");
        for (Map.Entry<String,String> entry : tree.entrySet()) {
            System.out.println(entry);
        }
    }
}
