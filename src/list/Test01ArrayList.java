package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Test01ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // 数组列表

        // 1添加元素
        list.add(123);
        list.add(346);
        System.out.println(list);

        // 2替换元素
        list.set(1,777);
        System.out.println(list);

        // 将list2 中的所有数据放到list中 3 addAll()
        Collection<Integer> list2 = new ArrayList<>(); // 默认给定的长度是10 DEEAULT_CAPACIIY=10
        list2.add(666);
        list2.add(999);
        list.addAll(list2);
        System.out.println(list);

        // 循环list2中所有的数据
        for(Integer integer :list2) {
            System.out.println(integer);

            // 5删除循环出的对象
            list2.remove(0);
            System.out.println(list2);

            // list 是否有数据 6 isEmpty() 是否为空
            if (!list.isEmpty()) {
                System.out.println("list.size=" + list.size());

                // 7 清空
                list.clear();
            }
            System.out.println("list.size="+list.size());
        }

    }

}
