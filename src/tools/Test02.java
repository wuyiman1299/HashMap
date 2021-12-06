package tools;

import java.util.Arrays;
import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        String [] str = new String[] {"中文","计算机","ABC", "123","qq@qq.com","中文"};
        // 将数组转为list ，在把list转为set
         HashSet<String> set = new HashSet<>(Arrays.asList(str));
         for (String s : set ) {
             System.out.println(s);
         }
         // 将set 转换为数组 集合.toArray()
        Object[] objects = set.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i] + "\t");
        }
        for (Object o : objects) {
            System.out.print( o + "\t");
        }
}
    }

