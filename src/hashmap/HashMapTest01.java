package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest01 {
    public static void main(String[] args) {
        HashMap<String,String> map01 = new HashMap<>();
        map01.put("name" ,"甜心");
        map01.put("age","18");
        map01.put("sex","女");
        System.out.println(map01);
        for (Map.Entry<String,String >m : map01.entrySet()) {
            System.out.println(m);
        }

        for (String key : map01.keySet() ) {
            System.out.println(key +"=" + map01.get(key));
        }

        for (String value : map01.values()) {
            System.out.println();
        }

        // 负载因子，当容量使用到75%时，触发扩睿的操作
        // DEFAULT_LOAD_FACTOR = 0.75   负载因子
        // DEFAULT_INITIAL_CAPACITY = 16
        //
    }
}
