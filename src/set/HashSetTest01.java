package set;

import java.util.HashSet;

public class HashSetTest01 {
    public static void main(String[] args) {
        HashSet<Object> set01 = new HashSet<>();
        set01.add("aaa");
        set01.add("bbb");
        set01.add("ccc");
        set01.add(111);
        set01.add(222);
        set01.add(333);
        for ( Object e :set01) {
            System.out.println(e + "\t");
        }

    }
}
