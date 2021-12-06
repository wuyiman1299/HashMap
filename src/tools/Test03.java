package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
      HashMap<String,String> map =  new HashMap<>();
        map.put("1","甜心");
        map.put("2","曼曼");
        map.put("3","666");

       /* for (Map.Entry<String,String> e : map.entrySet()) {
            System.out.println(e);
        }*/

        // 迭代器访问map ，优点：占用内存小，速度快，能够较大的map
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> e = iterator.next();
            System.out.println(e);

        }

       /* // 取出所有的键的值作为一个集合
        ArrayList<String> strings = new ArrayList<>(map.keySet());
        for (String s : strings) {
            System.out.println(s + "\t");
        }


        // 取出所有的值，把值放在一个list中 new ArrayList<>(接受一个集合)
        ArrayList<String>strlist = new ArrayList<>(map.values());
        for (int i = 0; i < strlist.size(); i++) {
            System.out.println(strlist.get(i));
        }
        for (String s : strlist) {
            System.out.println(s);
        } */
    }
}
