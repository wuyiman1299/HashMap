package set;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Object> set01 = new TreeSet<>();
        set01.add(111);
        set01.add(222);
        set01.add(333);
        set01.add(444);
        set01.add(555);

        for ( Object e :set01) {
            System.out.print(e + "\t");
        }

    }
}
